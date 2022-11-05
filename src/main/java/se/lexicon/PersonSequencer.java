/******************************************************************************
 * Copyright (c) Farhad Towfighian 2022.                                      *
 * https://github.com/far-tow                                                 *
 ******************************************************************************/

package se.lexicon;

public class PersonSequencer {

    private static int sequencer = 320;

    public static int getNextId(){
        return ++sequencer;
    }

}
