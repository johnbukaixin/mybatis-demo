package com.ptl.demo.bean;

import java.io.Serializable;


/**
 * `OPTION_ID` decimal(10,0) NOT NULL, `TITLE` text NOT NULL, `SCORE`
 * decimal(10,0) NOT NULL, `NEXT_QUESTION_CODE` varchar(32) DEFAULT NULL,
 * `OPTION_CODE` varchar(32) NOT NULL, `QUESTION_CODE` varchar(32) DEFAULT NULL
 * 
 * @author Administrator
 *
 */
public class Option implements Serializable {
	private int optionId;
	private String title;
	private int score;
	private String nextQuestionCode;
	private String optionCode;
    private String questionCode;

	public String getQuestionCode() {
		return questionCode;
	}

	public void setQuestionCode(String questionCode) {
		this.questionCode = questionCode;
	}

	public int getOptionId() {
		return optionId;
	}

	public void setOptionId(int optionId) {
		this.optionId = optionId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getNextQuestionCode() {
		return nextQuestionCode;
	}

	public void setNextQuestionCode(String nextQuestionCode) {
		this.nextQuestionCode = nextQuestionCode;
	}

	public String getOptionCode() {
		return optionCode;
	}

	public void setOptionCode(String optionCode) {
		this.optionCode = optionCode;
	}

	@Override
	public String toString() {
		return "Option [optionId=" + optionId + ", title=" + title + ", score=" + score + ", nextQuestionCode="
				+ nextQuestionCode + ", optionCode=" + optionCode + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nextQuestionCode == null) ? 0 : nextQuestionCode.hashCode());
		result = prime * result + ((optionCode == null) ? 0 : optionCode.hashCode());
		result = prime * result + optionId;
		result = prime * result + score;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Option other = (Option) obj;
		if (nextQuestionCode == null) {
			if (other.nextQuestionCode != null)
				return false;
		} else if (!nextQuestionCode.equals(other.nextQuestionCode))
			return false;
		if (optionCode == null) {
			if (other.optionCode != null)
				return false;
		} else if (!optionCode.equals(other.optionCode))
			return false;
		if (optionId != other.optionId)
			return false;
		if (score != other.score)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}


	

}
