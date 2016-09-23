package com.graph.db.file.annotation.subscriber;

import com.graph.db.file.AbstractSubscriber;
import com.graph.db.file.annotation.output.OutputFileType;

public class VariantToAnnotationSubscriber extends AbstractSubscriber<Object> {

	public VariantToAnnotationSubscriber(String outputFolder) {
		super(outputFolder);
	}

	@Override
	protected OutputFileType getOutputFileType() {
		return OutputFileType.VARIANT_TO_ANNOTATED_VARIANT;
	}
	
}
