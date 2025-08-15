package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import ru.ok.tamtam.nano.Protos;

/* renamed from: y  reason: default package */
public final class y implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ y(int i) {
        this.a = i;
    }

    /* JADX WARNING: type inference failed for: r2v18, types: [android.view.View$BaseSavedState, java.lang.Object, sof] */
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable((ClassLoader) null) == null) {
                    return z.b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new bm(parcel, (ClassLoader) null);
            case 2:
                return new dr0(parcel, (ClassLoader) null);
            case 3:
                return new b03(parcel, (ClassLoader) null);
            case 4:
                return new tw3(parcel, (ClassLoader) null);
            case 5:
                return new x06(parcel, (ClassLoader) null);
            case 6:
                return new c18(parcel, (ClassLoader) null);
            case 7:
                return new xdc(parcel, (ClassLoader) null);
            case 8:
                return new m0d(parcel, (ClassLoader) null);
            case 9:
                return new god(parcel, (ClassLoader) null);
            case 10:
                return new npe(parcel, (ClassLoader) null);
            case 11:
                return new lwe(parcel, (ClassLoader) null);
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return new hof(parcel, (ClassLoader) null);
            default:
                ? baseSavedState = new View.BaseSavedState(parcel, (ClassLoader) null);
                baseSavedState.a = parcel.readInt();
                baseSavedState.b = parcel.readInt();
                baseSavedState.c = parcel.readParcelable((ClassLoader) null);
                return baseSavedState;
        }
    }

    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new z[i];
            case 1:
                return new bm[i];
            case 2:
                return new dr0[i];
            case 3:
                return new b03[i];
            case 4:
                return new tw3[i];
            case 5:
                return new x06[i];
            case 6:
                return new c18[i];
            case 7:
                return new xdc[i];
            case 8:
                return new m0d[i];
            case 9:
                return new god[i];
            case 10:
                return new npe[i];
            case 11:
                return new lwe[i];
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return new hof[i];
            default:
                return new sof[i];
        }
    }

    /* JADX WARNING: type inference failed for: r1v17, types: [android.view.View$BaseSavedState, java.lang.Object, sof] */
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return z.b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new bm(parcel, classLoader);
            case 2:
                return new dr0(parcel, classLoader);
            case 3:
                return new b03(parcel, classLoader);
            case 4:
                return new tw3(parcel, classLoader);
            case 5:
                return new x06(parcel, classLoader);
            case 6:
                return new c18(parcel, classLoader);
            case 7:
                return new xdc(parcel, classLoader);
            case 8:
                return new m0d(parcel, classLoader);
            case 9:
                return new god(parcel, classLoader);
            case 10:
                return new npe(parcel, classLoader);
            case 11:
                return new lwe(parcel, classLoader);
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return new hof(parcel, classLoader);
            default:
                ? baseSavedState = new View.BaseSavedState(parcel, classLoader);
                baseSavedState.a = parcel.readInt();
                baseSavedState.b = parcel.readInt();
                baseSavedState.c = parcel.readParcelable(classLoader);
                return baseSavedState;
        }
    }
}
