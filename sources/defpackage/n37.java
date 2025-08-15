package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: n37  reason: default package */
public final class n37 implements Parcelable {
    public static final Parcelable.Creator<n37> CREATOR = new dj6(9);
    public final IntentSender a;
    public final Intent b;
    public final int c;
    public final int o;

    public n37(IntentSender intentSender, Intent intent, int i, int i2) {
        this.a = intentSender;
        this.b = intent;
        this.c = i;
        this.o = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.o);
    }

    public n37(Parcel parcel) {
        this((IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader()), (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }
}
