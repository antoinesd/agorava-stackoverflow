
package org.agorava.stackexchange.model;

import java.util.List;
import javax.annotation.Generated;

/**
 * Define some site specific stats
 */
@javax.annotation.Generated(date = "2012-07-28T10:40:41.612+02:00", comments = "generated by http://jsongen.byingtondesign.com/", value = { "https://api.stackexchange.com/2.0/info?site=stackoverflow" })
public class SiteSpecificStats{
   	private Number answers_per_minute;
   	private String api_revision;
   	private Number badges_per_minute;
   	private Number new_active_users;
   	private Number questions_per_minute;
   	private Number total_accepted;
   	private Number total_answers;
   	private Number total_badges;
   	private Number total_comments;
   	private Number total_questions;
   	private Number total_unanswered;
   	private Number total_users;
   	private Number total_votes;

 	public Number getAnswers_per_minute(){
		return this.answers_per_minute;
	}
	public void setAnswers_per_minute(Number answers_per_minute){
		this.answers_per_minute = answers_per_minute;
	}
 	public String getApi_revision(){
		return this.api_revision;
	}
	public void setApi_revision(String api_revision){
		this.api_revision = api_revision;
	}
 	public Number getBadges_per_minute(){
		return this.badges_per_minute;
	}
	public void setBadges_per_minute(Number badges_per_minute){
		this.badges_per_minute = badges_per_minute;
	}
 	public Number getNew_active_users(){
		return this.new_active_users;
	}
	public void setNew_active_users(Number new_active_users){
		this.new_active_users = new_active_users;
	}
 	public Number getQuestions_per_minute(){
		return this.questions_per_minute;
	}
	public void setQuestions_per_minute(Number questions_per_minute){
		this.questions_per_minute = questions_per_minute;
	}
 	public Number getTotal_accepted(){
		return this.total_accepted;
	}
	public void setTotal_accepted(Number total_accepted){
		this.total_accepted = total_accepted;
	}
 	public Number getTotal_answers(){
		return this.total_answers;
	}
	public void setTotal_answers(Number total_answers){
		this.total_answers = total_answers;
	}
 	public Number getTotal_badges(){
		return this.total_badges;
	}
	public void setTotal_badges(Number total_badges){
		this.total_badges = total_badges;
	}
 	public Number getTotal_comments(){
		return this.total_comments;
	}
	public void setTotal_comments(Number total_comments){
		this.total_comments = total_comments;
	}
 	public Number getTotal_questions(){
		return this.total_questions;
	}
	public void setTotal_questions(Number total_questions){
		this.total_questions = total_questions;
	}
 	public Number getTotal_unanswered(){
		return this.total_unanswered;
	}
	public void setTotal_unanswered(Number total_unanswered){
		this.total_unanswered = total_unanswered;
	}
 	public Number getTotal_users(){
		return this.total_users;
	}
	public void setTotal_users(Number total_users){
		this.total_users = total_users;
	}
 	public Number getTotal_votes(){
		return this.total_votes;
	}
	public void setTotal_votes(Number total_votes){
		this.total_votes = total_votes;
	}
}
