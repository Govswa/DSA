package com.testing;

public interface IMDMessage extends Iterable<IMDField>{
	IMDField getField(String field);
}
