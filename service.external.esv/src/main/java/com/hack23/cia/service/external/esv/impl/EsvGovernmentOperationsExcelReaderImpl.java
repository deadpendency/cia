/*
 * Copyright 2010 James Pether Sörling
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *	$Id$
 *  $HeadURL$
*/
package com.hack23.cia.service.external.esv.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import com.hack23.cia.service.external.esv.api.GovernmentOperationPeriodOutcome;

/**
 * The Class EsvGovernmentOperationsExcelReaderImpl.
 */
@Component
final class EsvGovernmentOperationsExcelReaderImpl implements EsvGovernmentOperationsExcelReader {

	/**
	 * Instantiates a new esv government operations excel reader impl.
	 */
	public EsvGovernmentOperationsExcelReaderImpl() {
		super();
	}

	private static XSSFWorkbook createGovermentOperationsWorkBook() throws IOException {
		return new XSSFWorkbook(EsvGovernmentOperationsExcelReaderImpl.class
				.getResourceAsStream("/central-government-operations-sddsplus-february-2018.xlsx"));
	}

	@Override
	public List<GovernmentOperationPeriodOutcome> getReport() throws IOException {
		final List<GovernmentOperationPeriodOutcome> result = new ArrayList<>();
		XSSFWorkbook wb = createGovermentOperationsWorkBook();

		XSSFSheet sheet = wb.getSheetAt(0);
		XSSFRow row;

		Iterator rows = sheet.rowIterator();

		while (rows.hasNext()) {
			row = (XSSFRow) rows.next();

			if (row.getLastCellNum() == 6 && row.getCell(2).getCellType() == Cell.CELL_TYPE_NUMERIC) {
				GovernmentOperationPeriodOutcome GovernmentOperationPeriodOutcome = new GovernmentOperationPeriodOutcome();

				GovernmentOperationPeriodOutcome.setVariableName(row.getCell(0).getStringCellValue());
				GovernmentOperationPeriodOutcome.setPeriod(row.getCell(1).getStringCellValue());

				GovernmentOperationPeriodOutcome.setValue(row.getCell(2).getNumericCellValue());
				GovernmentOperationPeriodOutcome
						.setPercentageChangeFromPreviousToLatest(row.getCell(3).getNumericCellValue());
				GovernmentOperationPeriodOutcome
						.setPercentageChangeFromSamePeriodLastYearToLatest(row.getCell(4).getNumericCellValue());

				GovernmentOperationPeriodOutcome.setObservationStatus(row.getCell(5).getStringCellValue());

				result.add(GovernmentOperationPeriodOutcome);
			}
		}
		return result;
	}

}
