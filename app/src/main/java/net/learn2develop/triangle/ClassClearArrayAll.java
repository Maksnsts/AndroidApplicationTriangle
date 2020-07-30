package net.learn2develop.triangle;

import net.learn2develop.triangle.StageFive.ClassArrayHelpStage5;
import net.learn2develop.triangle.StageFour.ClassArrayStage4;
import net.learn2develop.triangle.StageOne.ClassArrayStage1;
import net.learn2develop.triangle.StageThree.ClassArrayHelpStage3;
import net.learn2develop.triangle.StageTwo.ClassArrayHelpStage2;

public class ClassClearArrayAll {

    public static void clearArrayAll(){
        // Stage 1
        if (ClassArrayStage1.arrayListFirstStage.size() > 0) {
            ClassArrayStage1.arrayListFirstStage.subList(0, ClassArrayStage1.arrayListFirstStage.size()).clear();
        } //Рестарт игры

        // Stage 2
        if (ClassArrayHelpStage2.arrayListStage2.size() > 0) {
            ClassArrayHelpStage2.arrayListStage2.subList(0, ClassArrayHelpStage2.arrayListStage2.size()).clear();
        }

        if (ClassArrayHelpStage2.arrayListFinalStage2Player2.size() > 0) {
            ClassArrayHelpStage2.arrayListFinalStage2Player2.subList(0, ClassArrayHelpStage2.arrayListFinalStage2Player2.size()).clear();
        }

        if (ClassArrayHelpStage2.arrayListFinalStage2.size() > 0) {
            ClassArrayHelpStage2.arrayListFinalStage2.subList(0, ClassArrayHelpStage2.arrayListFinalStage2.size()).clear();
        }

        if (ClassArrayHelpStage2.arrayListDuplicatStage2.size() > 0) {
            ClassArrayHelpStage2.arrayListDuplicatStage2.subList(0, ClassArrayHelpStage2.arrayListDuplicatStage2.size()).clear();
        }

        // Stage 3
        if (ClassArrayHelpStage3.arrayListStage3.size() > 0) {
            ClassArrayHelpStage3.arrayListStage3.subList(0, ClassArrayHelpStage3.arrayListStage3.size()).clear();
        }

        if (ClassArrayHelpStage3.arrayListFinalStage3Player2.size() > 0) {
            ClassArrayHelpStage3.arrayListFinalStage3Player2.subList(0, ClassArrayHelpStage3.arrayListFinalStage3Player2.size()).clear();
        }

        if (ClassArrayHelpStage3.arrayListFinalStage3.size() > 0) {
            ClassArrayHelpStage3.arrayListFinalStage3.subList(0, ClassArrayHelpStage3.arrayListFinalStage3.size()).clear();
        }

        if (ClassArrayHelpStage3.arrayListDuplicatStage3.size() > 0) {
            ClassArrayHelpStage3.arrayListDuplicatStage3.subList(0, ClassArrayHelpStage3.arrayListDuplicatStage3.size()).clear();
        }

        // Stage 4
        if (ClassArrayStage4.arrayListStage4.size() > 0) {
            ClassArrayStage4.arrayListStage4.subList(0, ClassArrayStage4.arrayListStage4.size()).clear();
        } //Рестарт игры

        // Stage 5
        if (ClassArrayHelpStage5.arrayListFirstAsks5.size() > 0) {
            ClassArrayHelpStage5.arrayListFirstAsks5.subList(0, ClassArrayHelpStage5.arrayListFirstAsks5.size()).clear();
        } //Рестарт игры

    }
}
