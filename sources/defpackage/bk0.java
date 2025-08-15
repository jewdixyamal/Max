package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;

/* renamed from: bk0  reason: default package */
public final class bk0 extends View.BaseSavedState {
    public static final Parcelable.Creator<bk0> CREATOR = new d6(11);
    public boolean X;
    public float a;
    public float b;
    public ArrayList c;
    public float o;

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.a);
        parcel.writeFloat(this.b);
        parcel.writeList(this.c);
        parcel.writeFloat(this.o);
        parcel.writeBooleanArray(new boolean[]{this.X});
    }
}
