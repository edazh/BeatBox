package com.edazh.beatbox;

import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by 12392 on 2017/7/20 0020.
 */
public class SoundViewModelTest {
    private BeatBox mBeatBox;
    private Sound mSound;
    private SoundViewModel mSubject;

    @Before
    public void setUp() throws Exception {
        mBeatBox = Mockito.mock(BeatBox.class);
        mSound = new Sound("assetPath");
        mSubject = new SoundViewModel(mBeatBox);
        mSubject.setSound(mSound);
    }

    @Test
    public void exposesSoundNamseAsTitle() {
        assertThat(mSubject.getTitle(), Is.is(mSound.getName()));
    }

    @Test
    public void callsBeatBoxPlayOnButtonClicked() {

        mSubject.onButtonClicked();

        Mockito.verify(mBeatBox).play(mSound);
    }
}