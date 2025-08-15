package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

public final class CameraPosition extends n3 implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new vqf(13);
    public final LatLng a;
    public final float b;
    public final float c;
    public final float o;

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        fp3.o(latLng, "camera target must not be null.");
        boolean z = false;
        if (f2 >= 0.0f && f2 <= 90.0f) {
            z = true;
        }
        fp3.h(z, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f2));
        this.a = latLng;
        this.b = f;
        this.c = f2 + 0.0f;
        this.o = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.a.equals(cameraPosition.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(cameraPosition.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(cameraPosition.c) && Float.floatToIntBits(this.o) == Float.floatToIntBits(cameraPosition.o);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.o)});
    }

    public final String toString() {
        qz7 qz7 = new qz7((Object) this);
        qz7.h(this.a, "target");
        qz7.h(Float.valueOf(this.b), "zoom");
        qz7.h(Float.valueOf(this.c), "tilt");
        qz7.h(Float.valueOf(this.o), "bearing");
        return qz7.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int T = ay7.T(parcel, 20293);
        ay7.P(parcel, 2, this.a, i);
        ay7.X(parcel, 3, 4);
        parcel.writeFloat(this.b);
        ay7.X(parcel, 4, 4);
        parcel.writeFloat(this.c);
        ay7.X(parcel, 5, 4);
        parcel.writeFloat(this.o);
        ay7.W(parcel, T);
    }
}
