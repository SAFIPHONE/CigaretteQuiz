package support.android.com.cigarettequiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int resultAge;
    int resultCigarette;
    int resultSmoke;
    int resultKind;
    int resultCough;
    int resultCampaign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //This method counts the points for Age if one button is checked .
    public void addPointsForAge(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.buttonAge1:
                if (checked)
                    // Add 1 point for Age
                    resultAge=0;
                resultAge=resultAge + 1;
                break;
            case R.id.buttonAge2:
                if (checked)
                    // Add 2 points for Age
                    resultAge=0;
                resultAge=resultAge + 2;
                break;
            case R.id.buttonAge3:
                if (checked)
                    // Add 3 points for Age
                    resultAge=0;
                resultAge=resultAge + 3;
                break;
            case R.id.buttonAge4:
                if (checked)
                    // Add 3 points for Age
                    resultAge=0;
                resultAge=resultAge + 4;
                break;
        }
    }
//This method counts the points for Cigarette per day if one button is checked .

    public void addForCigarette(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.buttonCig1:
                if (checked)
                    // Add 1 point for Cigarette
                    resultCigarette=0;
                resultCigarette=resultCigarette + 1;
                break;
            case R.id.buttonCig2:
                if (checked)
                    // Add 2 points for Cigarette
                    resultCigarette=0;
                resultCigarette=resultCigarette + 2;
                break;
            case R.id.buttonCig3:
                if (checked)
                    // Add 3 points for Cigarette
                    resultCigarette=0;
                resultCigarette=resultCigarette + 3;
                break;
            case R.id.buttonCig4:
                if (checked)
                    // Add 3 points for Cigarette
                    resultCigarette=0;
                resultCigarette=resultCigarette + 4;
                break;
        }
    }

    //This method counts the points for how long have u been smoking if one button is checked .
    public void addForSmoke(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.buttonSmoke1:
                if (checked)
                    // Add 1 point for Cigarette
                    resultSmoke=0;
                resultSmoke=resultSmoke + 1;
                break;
            case R.id.buttonSmoke2:
                if (checked)
                    // Add 3 points for Cigarette
                    resultSmoke=0;
                resultSmoke=resultSmoke + 3;
                break;
            case R.id.buttonSmoke3:
                if (checked)
                    // Add 5 points for Cigarette
                    resultSmoke=0;
                resultSmoke=resultSmoke + 5;
                break;
            case R.id.buttonSmoke4:
                if (checked)
                    // Add 7 points for Cigarette
                    resultSmoke=0;
                resultSmoke=resultSmoke + 7;
                break;
        }
    }

    //This method counts the points for What kind of cigarettes are you smoking if one button is checked .
    public void addForKind(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.buttonKind1:
                if (checked)
                    // Add 5 point for Kind
                    resultKind=0;
                resultKind=resultKind + 5;
                break;
            case R.id.buttonKind2:
                if (checked)
                    // Add 3 points for Kind
                    resultKind=0;
                resultKind=resultKind + 3;
                break;
            case R.id.buttonKind3:
                if (checked)
                    // Add 1 points for Kind
                    resultKind=0;
                resultKind=resultKind + 1;
                break;
        }
    }

    //This method counts the points for if you cough or not.
    public void addForCough(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.buttonCough1:
                if (checked)
                    // Add 5 point for Cough
                    resultCough=0;
                resultCough=resultCough + 5;
                break;
            case R.id.buttonCough2:
                if (checked)
                    // Add 0 points for Kind
                    resultCough=0;
                break;
        }
    }
    //This method counts the points for campaign reason if one button is checked .
    public void addForCampaign(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.buttonCampaign1:
                if (checked)
                    // Add 1 point for Campaign
                    resultCampaign=0;
                resultCampaign=resultCampaign + 1;
                break;
            case R.id.buttonCampaign2:
                if (checked)
                    // Add 0 points for Campaign
                    resultCampaign=0;
                break;
            case R.id.buttonCampaign3:
                if (checked)
                    // Add 5 points for Campaign
                    resultCampaign=0;
                resultCampaign=resultCampaign + 5;
                break;
        }
    }

    /**
     * This method is called when the submit result is clicked.
     */
    public void submitResult(View view) {
        //find the user name
        EditText nameField = (EditText)findViewById(R.id.name_field);
        String name = nameField.getText().toString();
//        figure out if the user wants checked the answers or not for AgeGroup

        RadioButton countAgeButton1 = (RadioButton) findViewById(R.id.buttonAge1);
        boolean finalButtonAge1 = countAgeButton1.isChecked();

        RadioButton countAgeButton2 = (RadioButton) findViewById(R.id.buttonAge2);
        boolean finalButtonAge2 = countAgeButton2.isChecked();

        RadioButton countAgeButton3 = (RadioButton) findViewById(R.id.buttonAge3);
        boolean finalButtonAge3 = countAgeButton3.isChecked();

        RadioButton countAgeButton4 = (RadioButton) findViewById(R.id.buttonAge4);
        boolean finalButtonAge4 = countAgeButton4.isChecked();

        //        figure out if the user wants checked the answers or not for CigaretteGroup

        RadioButton countCigaretteButton1 = (RadioButton) findViewById(R.id.buttonCig1);
        boolean finalButtonCigarette1 = countCigaretteButton1.isChecked();

        RadioButton countCigaretteButton2 = (RadioButton) findViewById(R.id.buttonCig2);
        boolean finalButtonCigarette2 = countCigaretteButton2.isChecked();

        RadioButton countCigaretteButton3 = (RadioButton) findViewById(R.id.buttonCig3);
        boolean finalButtonCigarette3 = countCigaretteButton3.isChecked();

        RadioButton countCigaretteButton4 = (RadioButton) findViewById(R.id.buttonCig4);
        boolean finalButtonCigarette4 = countCigaretteButton4.isChecked();

        //        figure out if the user wants checked the answers or not for SmokeGroup

        RadioButton countSmokeButton1 = (RadioButton) findViewById(R.id.buttonSmoke1);
        boolean finalButtonSmoke1 = countSmokeButton1.isChecked();

        RadioButton countSmokeButton2 = (RadioButton) findViewById(R.id.buttonSmoke2);
        boolean finalButtonSmoke2 = countSmokeButton2.isChecked();

        RadioButton countSmokeButton3 = (RadioButton) findViewById(R.id.buttonSmoke3);
        boolean finalButtonSmoke3 = countSmokeButton3.isChecked();

        RadioButton countSmokeButton4 = (RadioButton) findViewById(R.id.buttonSmoke4);
        boolean finalButtonSmoke4 = countSmokeButton4.isChecked();

        //        figure out if the user wants checked the answers or not for SmokeGroup

        RadioButton countKindButton1 = (RadioButton) findViewById(R.id.buttonKind1);
        boolean finalButtonKind1 = countKindButton1.isChecked();

        RadioButton countKindButton2 = (RadioButton) findViewById(R.id.buttonKind2);
        boolean finalButtonKind2 = countKindButton2.isChecked();

        RadioButton countKindButton3 = (RadioButton) findViewById(R.id.buttonKind3);
        boolean finalButtonKind3 = countKindButton3.isChecked();

        //        figure out if the user wants checked the answers or not for CoughGroup

        RadioButton countCoughButton1 = (RadioButton) findViewById(R.id.buttonCough1);
        boolean finalButtonCough1 = countCoughButton1.isChecked();

        RadioButton countCoughButton2 = (RadioButton) findViewById(R.id.buttonCough2);
        boolean finalButtonCough2 = countCoughButton2.isChecked();

        //        figure out if the user wants checked the answers or not for SmokeGroup

        RadioButton countCampaignButton1 = (RadioButton) findViewById(R.id.buttonCampaign1);
        boolean finalButtonCampaign1 = countCampaignButton1.isChecked();

        RadioButton countCampaignButton2 = (RadioButton) findViewById(R.id.buttonCampaign2);
        boolean finalButtonCampaign2 = countCampaignButton2.isChecked();

        RadioButton countCampaignButton3 = (RadioButton) findViewById(R.id.buttonCampaign3);
        boolean finalButtonCampaign3 = countCampaignButton3.isChecked();

        //figure out the answer checked in the Checkboxes

        CheckBox problemsDaily1 = (CheckBox) findViewById(R.id.daily_problems_checkbox);
        boolean dailyProblems1=problemsDaily1.isChecked();

        CheckBox friendsCheckbox = (CheckBox) findViewById(R.id.friends_checkbox);
        boolean friendsCheckbox1=friendsCheckbox.isChecked();

        CheckBox workCheckbox = (CheckBox) findViewById(R.id.work_checkbox);
        boolean workCheckbox1=workCheckbox.isChecked();

        CheckBox habitCheckbox=(CheckBox) findViewById(R.id.habit_checkbox);
        boolean habitCheckbox1=habitCheckbox.isChecked();

        CheckBox iLikeIt = (CheckBox) findViewById(R.id.ilikeit_checkbox);
        boolean iLikeIt1 = iLikeIt.isChecked();

        CheckBox atWork=(CheckBox) findViewById(R.id.at_work_checkbox);
        boolean atWork1=atWork.isChecked();

        CheckBox atHome=(CheckBox) findViewById(R.id.at_home_checkbox);
        boolean atHome1=atHome.isChecked();

        CheckBox inPub= (CheckBox) findViewById(R.id.in_pub_checkbox);
        boolean inPub1= inPub.isChecked();

        CheckBox smokeSame=(CheckBox) findViewById(R.id.same_checkbox);
        boolean smokeSame1=smokeSame.isChecked();

        CheckBox angryCheckbox=(CheckBox) findViewById(R.id.angry_checkbox);
        boolean angryCheckbox1=angryCheckbox.isChecked();

        CheckBox whenStressed= (CheckBox) findViewById(R.id.when_stressed_checkbox);
        boolean whenStressed1= whenStressed.isChecked();

        CheckBox whenRestless= (CheckBox) findViewById(R.id.when_restless_checkbox);
        boolean whenRestless1= whenRestless.isChecked();

        CheckBox equallyCheckbox=(CheckBox) findViewById(R.id.equally_checkbox);
        boolean equallyBox= equallyCheckbox.isChecked();

        //Show an error if the user didn't complete any answer at question1.
        if (!finalButtonAge1 && !finalButtonAge2 && !finalButtonAge3 && !finalButtonAge4){
            Toast.makeText(this,"You forgot to complete Question 1.",
                    Toast.LENGTH_SHORT).show();
            return;
        }

        //Show an error if the user didn't complete any answer at question2.
        if (!finalButtonCigarette1 && !finalButtonCigarette2 && !finalButtonCigarette3 && !finalButtonCigarette4){
            Toast.makeText(this,"You forgot to complete Question 2. ",
                    Toast.LENGTH_SHORT).show();
            return;
        }

        //Show an error if the user didn't complete any answer at question3.
        if (!finalButtonSmoke1 && !finalButtonSmoke2 && !finalButtonSmoke3 && !finalButtonSmoke4){
            Toast.makeText(this,"You forgot to complete Question 3. ",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        //Show an error if the user didn't complete any answer at question4.
        if (!finalButtonKind1 && !finalButtonKind2 && !finalButtonKind3){
            Toast.makeText(this,"You forgot to complete Question 4. ",
                    Toast.LENGTH_SHORT).show();
            return;
        }

        //Show an error if the user didn't complete any answer at question5.
        if (!finalButtonCough1 && !finalButtonCough2){
            Toast.makeText(this,"You forgot to complete Question 5. ",
                    Toast.LENGTH_SHORT).show();
            return;
        }

        //Show an error if the user didn't complete any answer at question6.
        if (!dailyProblems1 && !friendsCheckbox1 && !workCheckbox1 && !habitCheckbox1 && iLikeIt1){
            Toast.makeText(this,"You forgot to complete Question 6. \nRemember, you can choose one ore more answers. ",
                    Toast.LENGTH_SHORT).show();
            return;
        }

        //Show an error if the user didn't complete any answer at question7.
        if (!atWork1 && !atHome1 && !inPub1 && !smokeSame1 ){
            Toast.makeText(this,"You forgot to complete Question 7. \nRemember, you can choose one ore more answers. ",
                    Toast.LENGTH_SHORT).show();
            return;
        }

        //Show an error if the user didn't complete any answer at question8.
        if (!angryCheckbox1 && !whenStressed1 && !whenRestless1 && !equallyBox ){
            Toast.makeText(this,"You forgot to complete Question 8. \nRemember, you can choose one ore more answers. ",
                    Toast.LENGTH_SHORT).show();
            return;
        }

        //Show an error if the user didn't complete any answer at question5.
        if (!finalButtonCampaign1 && !finalButtonCampaign2 && !finalButtonCampaign3){
            Toast.makeText(this,"You forgot to complete Question 9. ",
                    Toast.LENGTH_SHORT).show();
            return;
        }

        int finalScore= calculateFinalResult(finalButtonAge1, finalButtonAge2, finalButtonAge3, finalButtonAge4,
                finalButtonCigarette1, finalButtonCigarette2,finalButtonCigarette3,finalButtonCigarette4,
                finalButtonSmoke1,finalButtonSmoke2,finalButtonSmoke3,finalButtonSmoke4,
                finalButtonKind1, finalButtonKind2, finalButtonKind3, finalButtonCough1,finalButtonCough2,
                finalButtonCampaign1, finalButtonCampaign2,finalButtonCampaign3, dailyProblems1, friendsCheckbox1,
                workCheckbox1, habitCheckbox1, iLikeIt1, atWork1, atHome1, inPub1, smokeSame1,
                angryCheckbox1, whenStressed1, whenRestless1, equallyBox);

        displayResultFinal(finalScore);


        //Display a pop-up if the user didn't complete the name field.
        if (nameField.getText().toString().trim().equalsIgnoreCase("")) {
            nameField.setError("This field cannot be blank");
            return;
        }

        //Show an error if the user didn't complete any question.
        if (finalScore == 0){
            // Show an error message as a toast
            Toast.makeText(this,"You have to complete the quiz in order to show an result ",
                    Toast.LENGTH_SHORT).show();
            // Exit this method early because there's nothing left to do
            return;
        }

        //Show the result of the quiz based on final result.
        if (finalScore <= 61){
            // Show an error message as a toast
            Toast.makeText(this,"Dear Mrs./Mr.: " + name + "," + "\nYou are not a hardcore smoker, but you can consider to quit, otherwise you'll have health problems.", Toast.LENGTH_SHORT).show();
            // Exit this method early because there's nothing left to do
            return;
        } else{
            // Show an error message as a toast
            Toast.makeText(this,"Dear Mrs./Mr.: " + name + "," + "\nYou are a HARDCORE smoker, you have to quit smoking immediately and go see a doctor, otherwise you'll have health problems.",
                    Toast.LENGTH_SHORT).show();
            // Exit this method early because there's nothing left to do
            return;
        }
    }

    /**
     * Calculates the total score of the quiz.
     * @return the total score
     *
     */
    private int calculateFinalResult(boolean addAge1, boolean addAge2, boolean addAge3,
                                     boolean addAge4, boolean addCig1, boolean addCig2, boolean addCig3, boolean addCig4,
                                     boolean addSmoke1, boolean addSmoke2, boolean addSmoke3, boolean addSmoke4,
                                     boolean addKind1, boolean addKind2, boolean addKind3, boolean addCough1, boolean addCough2,
                                     boolean addCampaign1, boolean addCampaign2, boolean addCampaign3, boolean addDailyProblems,
                                     boolean addFriendsCheckbox, boolean addWorkCheckbox, boolean addHabitCheckbox, boolean addIlikeIt,
                                     boolean addAtWork, boolean addAtHome, boolean addInPub, boolean addSameCheckbox,boolean addAngryCheckbox, boolean addWhenStressed,
                                     boolean addWhenRestless, boolean addEquallyCheckbox) {
        //Result for AgeGroup
        int finalResult = 0;
        // Add 1 point if the user wants asnwer 1.
        if (addAge1) {
            finalResult = finalResult + 1;
        }

        //Add 2 points if the user wants answer2.
        if (addAge2){
            finalResult = finalResult + 2;
        }
        //Add 3 points if the user wants answer3.

        if (addAge3){
            finalResult=finalResult + 3;
        }
        //Add 4 points if the user wants answer4.
        if (addAge4){
            finalResult=finalResult+4;
        }

        //Result for CigaretteGroup
//        int cigResult=0;
        // Add 1 point if the user wants asnwer 1.
        if (addCig1) {
            finalResult = finalResult + 1;
        }
        //Add 2 points if the user wants answer2.
        if (addCig2){
            finalResult = finalResult + 2;
        }
        //Add 3 points if the user wants answer3.

        if (addCig3){
            finalResult=finalResult + 3;
        }
        //Add 4 points if the user wants answer4.
        if (addCig4){
            finalResult=finalResult+4;
        }

        //Result for SmokeGroup
//        int smokeResult=0;
        // Add 1 point if the user wants asnwer 1.
        if (addSmoke1) {
            finalResult = finalResult + 1;
        }
        //Add 3 points if the user wants answer2.
        if (addSmoke2){
            finalResult = finalResult + 3;
        }
        //Add 5 points if the user wants answer3.

        if (addSmoke3){
            finalResult=finalResult + 5;
        }
        //Add 7 points if the user wants answer4.
        if (addSmoke4){
            finalResult=finalResult+7;
        }

        //Result for KindGroup

        // Add 5 point if the user wants asnwer 1.
        if (addKind1) {
            finalResult = finalResult + 5;
        }
        //Add 3 points if the user wants answer2.
        if (addKind2){
            finalResult = finalResult + 3;
        }
        //Add 1 points if the user wants answer3.

        if (addKind3){
            finalResult=finalResult + 1;
        }

        //Result for CoughGroup

        // Add 5 point if the user wants asnwer 1.
        if (addCough1) {
            finalResult = finalResult + 5;
        }
        //Add 0 points if the user wants answer2.
        if (addCough2){
            finalResult = finalResult + 0;
        }

        //Result for KindGroup

        // Add 1 point if the user wants asnwer 1.
        if (addCampaign1) {
            finalResult = finalResult + 1;
        }
        //Add 0 points if the user wants answer2.
        if (addCampaign2){
            finalResult = finalResult + 0;
        }
        //Add 5 points if the user wants answer3.

        if (addCampaign3){
            finalResult=finalResult + 5;
        }

        // Add 3 points if the user check Checkbox1.1
        if (addDailyProblems){
            finalResult=finalResult+3;
        }

        // Add 3 points if the user check Checkbox2.1
        if (addFriendsCheckbox){
            finalResult=finalResult+3;
        }

        // Add 3 points if the user check Checkbox3.1
        if (addWorkCheckbox){
            finalResult=finalResult+3;
        }
        // Add 5 points if the user check Checkbox4.1
        if (addHabitCheckbox){
            finalResult=finalResult+5;
        }

        // Add 10 points if the user check Checkbox5.1
        if (addIlikeIt){
            finalResult=finalResult+10;
        }

        // Add 3 points if the user check Checkbox1.2
        if (addAtWork){
            finalResult=finalResult+3;
        }

        // Add 5 points if the user check Checkbox2.2
        if (addAtHome){
            finalResult=finalResult+5;
        }

        // Add 3 points if the user check Checkbox3.2
        if (addInPub){
            finalResult=finalResult+3;
        }

        // Add 10 points if the user check Checkbox4.2
        if (addSameCheckbox){
            finalResult=finalResult+10;
        }

        // Add 3 points if the user check Checkbox1.3
        if (addAngryCheckbox){
            finalResult=finalResult+3;
        }

        // Add 3 points if the user check Checkbox2.3
        if (addWhenStressed){
            finalResult=finalResult+3;
        }

        // Add 5 points if the user check Checkbox3.3
        if (addWhenRestless){
            finalResult=finalResult+5;
        }

        // Add 10 points if the user check Checkbox4.3
        if (addEquallyCheckbox){
            finalResult=finalResult+10;
        }

        //Calculate the total result by making the sum of all the groups.
        return finalResult;
    }
    /**
     * * Displays the total score.
     */
    public void displayResultFinal(int score) {
        TextView scoreView = (TextView) findViewById(R.id.result_final);
        scoreView.setText(String.valueOf(score));
    }
}