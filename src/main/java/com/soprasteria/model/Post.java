package com.soprasteria.model;

import java.util.Date;

/**
 * The Class Post.
 */
public class Post {

	/** The title. */
	private String title;
	
	/** The author. */
	private String author;
	
	/** The date. */
	private Date date;
	
	/** The content. */
	private String content;

	/**
	 * The Class Builder.
	 */
	public static class Builder {
		
		/** The title. */
		private String title;
		
		/** The author. */
		private String author;
		
		/** The date. */
		private Date date;
		
		/** The content. */
		private String content;

		/**
		 * Instantiates a new builder.
		 */
		public Builder() {
		}

		/**
		 * Title.
		 *
		 * @param value the value
		 * @return the builder
		 */
		public Builder title(String value) {
			title = value;
			return this;
		}

		/**
		 * Author.
		 *
		 * @param value the value
		 * @return the builder
		 */
		public Builder author(String value) {
			author = value;
			return this;
		}

		/**
		 * Date.
		 *
		 * @param value the value
		 * @return the builder
		 */
		public Builder date(Date value) {
			date = value;
			return this;
		}

		/**
		 * Content.
		 *
		 * @param value the value
		 * @return the builder
		 */
		public Builder content(String value) {
			content = value;
			return this;
		}

		/**
		 * Builds the.
		 *
		 * @return the post
		 */
		public Post build() {
			return new Post(this);
		}
	}

	/**
	 * Instantiates a new post.
	 *
	 * @param builder the builder
	 */
	public Post(Builder builder) {
		title = builder.title;
		author = builder.author;
		date = builder.date;
		content = builder.content;
	}

	/**
	 * Gets the title.
	 *
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the title.
	 *
	 * @param title the new title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets the author.
	 *
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Sets the author.
	 *
	 * @param author the new author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * Gets the date.
	 *
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * Sets the date.
	 *
	 * @param date the new date
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * Gets the content.
	 *
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * Sets the content.
	 *
	 * @param content the new content
	 */
	public void setContent(String content) {
		this.content = content;
	}
}
