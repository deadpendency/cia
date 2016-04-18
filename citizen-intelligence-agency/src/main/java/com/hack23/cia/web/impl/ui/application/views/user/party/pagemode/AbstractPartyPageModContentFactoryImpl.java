/*
 * Copyright 2014 James Pether Sörling
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
package com.hack23.cia.web.impl.ui.application.views.user.party.pagemode;

import com.hack23.cia.model.internal.application.data.party.impl.ViewRiksdagenParty;
import com.hack23.cia.model.internal.application.system.impl.ApplicationEventGroup;
import com.hack23.cia.web.impl.ui.application.action.ViewAction;
import com.hack23.cia.web.impl.ui.application.views.common.pagemode.AbstractPageModContentFactoryImpl;
import com.hack23.cia.web.impl.ui.application.views.common.viewnames.UserViews;
import com.vaadin.ui.Panel;

/**
 * The Class AbstractPoliticianPageModContentFactoryImpl.
 */
public abstract class AbstractPartyPageModContentFactoryImpl extends AbstractPageModContentFactoryImpl {

	/** The Constant PARTY. */
	private static final String PARTY = "Party:";

	/** The Constant NAME. */
	public static final String NAME = UserViews.PARTY_VIEW_NAME;

	/**
	 * Instantiates a new abstract party page mod content factory impl.
	 */
	protected AbstractPartyPageModContentFactoryImpl() {
		super();
	}

	/**
	 * Page completed.
	 *
	 * @param parameters
	 *            the parameters
	 * @param panel
	 *            the panel
	 * @param pageId
	 *            the page id
	 * @param viewRiksdagenParty
	 *            the view riksdagen party
	 */
	protected final void pageCompleted(final String parameters, final Panel panel, final String pageId,
			final ViewRiksdagenParty viewRiksdagenParty) {
		final StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(PARTY);
		stringBuilder.append(viewRiksdagenParty.getPartyName());
		panel.setCaption(stringBuilder.toString());

		getPageActionEventHelper().createPageEvent(ViewAction.VISIT_PARTY_VIEW, ApplicationEventGroup.USER, NAME, parameters,
				pageId);
	}

}
