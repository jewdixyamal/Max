package defpackage;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

/* renamed from: i3b  reason: default package */
public final class i3b implements Parcelable {
    public static final Parcelable.Creator<i3b> CREATOR = new fn9(26);
    public final long X;
    public final int Y;
    public final CharSequence Z;
    public final int a;
    public final long b;
    public final long c;
    public final float o;
    public final long s0;
    public final AbstractCollection t0;
    public final long u0;
    public final Bundle v0;
    public PlaybackState w0;

    public i3b(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List list, long j5, Bundle bundle) {
        AbstractCollection abstractCollection;
        List list2 = list;
        this.a = i;
        this.b = j;
        this.c = j2;
        this.o = f;
        this.X = j3;
        this.Y = i2;
        this.Z = charSequence;
        this.s0 = j4;
        if (list2 == null) {
            ls5 ls5 = zw6.b;
            abstractCollection = ffc.X;
        } else {
            abstractCollection = new ArrayList(list2);
        }
        this.t0 = abstractCollection;
        this.u0 = j5;
        this.v0 = bundle;
    }

    public static i3b a(Object obj) {
        ArrayList arrayList = null;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> j = e3b.j(playbackState);
        if (j != null) {
            arrayList = new ArrayList(j.size());
            for (PlaybackState.CustomAction next : j) {
                if (next != null) {
                    PlaybackState.CustomAction customAction = next;
                    Bundle l = e3b.l(customAction);
                    bi8.a(l);
                    h3b h3b = new h3b(e3b.f(customAction), e3b.o(customAction), e3b.m(customAction), l);
                    h3b.X = customAction;
                    arrayList.add(h3b);
                }
            }
        }
        Bundle a2 = f3b.a(playbackState);
        bi8.a(a2);
        i3b i3b = new i3b(e3b.r(playbackState), e3b.q(playbackState), e3b.i(playbackState), e3b.p(playbackState), e3b.g(playbackState), 0, e3b.k(playbackState), e3b.n(playbackState), arrayList, e3b.h(playbackState), a2);
        i3b.w0 = playbackState;
        return i3b;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", buffered position=");
        sb.append(this.c);
        sb.append(", speed=");
        sb.append(this.o);
        sb.append(", updated=");
        sb.append(this.s0);
        sb.append(", actions=");
        sb.append(this.X);
        sb.append(", error code=");
        sb.append(this.Y);
        sb.append(", error message=");
        sb.append(this.Z);
        sb.append(", custom actions=");
        sb.append(this.t0);
        sb.append(", active item id=");
        return zr6.k(sb, this.u0, "}");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.AbstractCollection, java.util.List] */
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeLong(this.b);
        parcel.writeFloat(this.o);
        parcel.writeLong(this.s0);
        parcel.writeLong(this.c);
        parcel.writeLong(this.X);
        TextUtils.writeToParcel(this.Z, parcel, i);
        parcel.writeTypedList(this.t0);
        parcel.writeLong(this.u0);
        parcel.writeBundle(this.v0);
        parcel.writeInt(this.Y);
    }

    public i3b(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readLong();
        this.o = parcel.readFloat();
        this.s0 = parcel.readLong();
        this.c = parcel.readLong();
        this.X = parcel.readLong();
        this.Z = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection createTypedArrayList = parcel.createTypedArrayList(h3b.CREATOR);
        if (createTypedArrayList == null) {
            ls5 ls5 = zw6.b;
            createTypedArrayList = ffc.X;
        }
        this.t0 = createTypedArrayList;
        this.u0 = parcel.readLong();
        this.v0 = parcel.readBundle(bi8.class.getClassLoader());
        this.Y = parcel.readInt();
    }
}
