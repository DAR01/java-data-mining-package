package org.jdmp.core.dataset;

import org.jdmp.core.util.AbstractEvent;
import org.jdmp.core.util.AbstractGUIObject;

public class DataSetListEvent extends AbstractEvent {
	private static final long serialVersionUID = 2735149853298564137L;

	public DataSetListEvent(HasDataSets source, EventType type, Object... data) {
		super((AbstractGUIObject) source, type, data);
	}
}
