/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alefew
 */
public class Birds {

  private String nameEnglish;
  private String nameLatin;
  private int count;

  public Birds(String nameEnglish, String nameLatin) {
    this.nameEnglish = nameEnglish;
    this.nameLatin = nameLatin;
  }

  public String getNameEnglish() {
    return this.nameEnglish;
  }

  public String getNameLatin() {
    return this.nameLatin;
  }

  public void increaseObservation(){
      this.count++;
  }
  
  public int getCount() {
    return this.count; // Just return the count value
  }

  @Override
  public String toString() {
    return this.nameEnglish + " (" + this.nameLatin + "): " + this.count + " observations";
  }
}
