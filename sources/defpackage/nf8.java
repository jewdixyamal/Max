package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.SparseArray;

/* renamed from: nf8  reason: default package */
public final class nf8 extends AsyncTask {
    public final int a;
    public final Context b;
    public final /* synthetic */ of8 c;

    public nf8(of8 of8, int i, Context context) {
        this.c = of8;
        this.a = i;
        this.b = context;
    }

    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        SparseArray sparseArray = of8.F0;
        int i = this.a;
        if (((Drawable.ConstantState) sparseArray.get(i)) == null) {
            return s36.n(this.b, i);
        }
        return null;
    }

    public final void onCancelled(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            of8.F0.put(this.a, drawable.getConstantState());
        }
        this.c.u0 = null;
    }

    public final void onPostExecute(Object obj) {
        Drawable drawable = (Drawable) obj;
        int i = this.a;
        of8 of8 = this.c;
        if (drawable != null) {
            of8.F0.put(i, drawable.getConstantState());
            of8.u0 = null;
        } else {
            Drawable.ConstantState constantState = (Drawable.ConstantState) of8.F0.get(i);
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            of8.u0 = null;
        }
        of8.setRemoteIndicatorDrawableInternal(drawable);
    }
}
