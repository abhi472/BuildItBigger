package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.fail;

/**
 * Created by abhi on 6/12/17.
 */
@RunWith(AndroidJUnit4.class)
public class JokesAsyncTaskTest {
    @Mock
    Context mContext;
    private ProgressDialog dialog;
    private JokesAsyncTask task;
    private String result = null;

    @Before
    public void beforeTaskTest() throws Exception {

        dialog = new ProgressDialog();
        task = new JokesAsyncTask(dialog) {
            @Override
            protected void onPostExecute(String s) {
            }
        };
    }
    @Test
    public void taskTest() {
        try {
            task.execute(mContext);
            result = task.get(15, TimeUnit.SECONDS);
            assertNotNull(result);
        } catch (Exception e) {
            fail("Connection Timed out!");
        }
    }
}
