package defpackage;

import android.os.AsyncTask;

/* renamed from: a87  reason: default package */
public final class a87 extends AsyncTask {
    public final /* synthetic */ i87 a;

    public a87(i87 i87) {
        this.a = i87;
    }

    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        while (true) {
            i87 i87 = this.a;
            d87 dequeueWork = i87.dequeueWork();
            if (dequeueWork == null) {
                return null;
            }
            i87.onHandleWork(dequeueWork.getIntent());
            dequeueWork.a();
        }
    }

    public final void onCancelled(Object obj) {
        Void voidR = (Void) obj;
        this.a.processorFinished();
    }

    public final void onPostExecute(Object obj) {
        Void voidR = (Void) obj;
        this.a.processorFinished();
    }
}
