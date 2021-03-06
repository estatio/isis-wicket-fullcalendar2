/*
 *  Copyright 2013~2014 Dan Haywood
 *
 *  Licensed under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package org.isisaddons.wicket.fullcalendar2.cpt.ui;

import org.isisaddons.wicket.fullcalendar2.cpt.applib.Calendarable;

import org.apache.wicket.Component;

import org.apache.isis.viewer.wicket.model.models.EntityCollectionModel;
import org.apache.isis.viewer.wicket.ui.ComponentFactory;

/**
 * {@link ComponentFactory} for {@link CalendarableCollectionAsFullCalendar2}.
 */
public class CalendarableCollectionAsFullCalendar2Factory extends CalendaredCollectionFactoryAbstract {

    private static final long serialVersionUID = 1L;

    public CalendarableCollectionAsFullCalendar2Factory() {
        super(Calendarable.class);
    }

    @Override
    protected Component newComponent(String id, EntityCollectionModel collectionModel) {
        return new CalendarableCollectionAsFullCalendar2(id, collectionModel);
    }
}
