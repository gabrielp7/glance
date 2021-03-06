/**
 * 
 */
package com.xored.glance.ui.controls.descriptors;

import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.widgets.Control;

import com.xored.glance.ui.controls.text.styled.ListeningStyledTextSource;
import com.xored.glance.ui.sources.ITextSource;
import com.xored.glance.ui.sources.ITextSourceDescriptor;

/**
 * @author Yuri Strot
 * 
 */
public class ListeningStyledTextDescriptor implements ITextSourceDescriptor {

	public ITextSource createSource(Control control) {
		return new ListeningStyledTextSource((StyledText) control);
	}

	public boolean isValid(Control control) {
		if (control instanceof StyledText) {
			StyledText text = (StyledText) control;
			return text.isListening(LineGetStyle);
		}
		return false;
	}

	static final int LineGetStyle = 3002;

}
