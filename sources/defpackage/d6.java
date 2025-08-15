package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;
import java.util.Locale;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: d6  reason: default package */
public final class d6 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ d6(int i) {
        this.a = i;
    }

    /* JADX WARNING: type inference failed for: r7v7, types: [android.view.View$BaseSavedState, zn, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v12, types: [java.lang.Object, cg0] */
    /* JADX WARNING: type inference failed for: r7v13, types: [android.view.View$BaseSavedState, bk0, java.lang.Object] */
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new e6(parcel);
            case 1:
                return new d8(parcel);
            case 2:
                return new w9(parcel.readInt(), parcel.readInt(), parcel.readString());
            case 3:
                return new tl(parcel);
            case 4:
                return new ul(parcel);
            case 5:
                ? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.a = parcel.readByte() != 0;
                return baseSavedState;
            case 6:
                String readString = parcel.readString();
                readString.getClass();
                return new uo(parcel.readInt(), readString);
            case 7:
                String readString2 = parcel.readString();
                readString2.getClass();
                return new vo(parcel.readInt(), readString2);
            case 8:
                return new ie0(parcel);
            case 9:
                return new je0(parcel);
            case 10:
                ? obj = new Object();
                obj.t0 = 255;
                obj.v0 = -2;
                obj.w0 = -2;
                obj.x0 = -2;
                obj.E0 = Boolean.TRUE;
                obj.a = parcel.readInt();
                obj.b = (Integer) parcel.readSerializable();
                obj.c = (Integer) parcel.readSerializable();
                obj.o = (Integer) parcel.readSerializable();
                obj.X = (Integer) parcel.readSerializable();
                obj.Y = (Integer) parcel.readSerializable();
                obj.Z = (Integer) parcel.readSerializable();
                obj.s0 = (Integer) parcel.readSerializable();
                obj.t0 = parcel.readInt();
                obj.u0 = parcel.readString();
                obj.v0 = parcel.readInt();
                obj.w0 = parcel.readInt();
                obj.x0 = parcel.readInt();
                obj.z0 = parcel.readString();
                obj.A0 = parcel.readString();
                obj.B0 = parcel.readInt();
                obj.D0 = (Integer) parcel.readSerializable();
                obj.F0 = (Integer) parcel.readSerializable();
                obj.G0 = (Integer) parcel.readSerializable();
                obj.H0 = (Integer) parcel.readSerializable();
                obj.I0 = (Integer) parcel.readSerializable();
                obj.J0 = (Integer) parcel.readSerializable();
                obj.K0 = (Integer) parcel.readSerializable();
                obj.N0 = (Integer) parcel.readSerializable();
                obj.L0 = (Integer) parcel.readSerializable();
                obj.M0 = (Integer) parcel.readSerializable();
                obj.E0 = (Boolean) parcel.readSerializable();
                obj.y0 = (Locale) parcel.readSerializable();
                obj.O0 = (Boolean) parcel.readSerializable();
                return obj;
            case 11:
                ? baseSavedState2 = new View.BaseSavedState(parcel);
                baseSavedState2.a = parcel.readFloat();
                baseSavedState2.b = parcel.readFloat();
                ArrayList arrayList = new ArrayList();
                baseSavedState2.c = arrayList;
                parcel.readList(arrayList, Float.class.getClassLoader());
                baseSavedState2.o = parcel.readFloat();
                baseSavedState2.X = parcel.createBooleanArray()[0];
                return baseSavedState2;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return new em0(parcel);
            case 13:
                return new fm0(parcel);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                Class<kc9> cls = kc9.class;
                return new tx0((kc9) parcel.readParcelable(cls.getClassLoader()), (kc9) parcel.readParcelable(cls.getClassLoader()), (v34) parcel.readParcelable(v34.class.getClassLoader()), (kc9) parcel.readParcelable(cls.getClassLoader()), parcel.readInt());
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new gg1(parcel.readLong(), parcel.readInt());
            case 16:
                Class<r22> cls2 = r22.class;
                return new r22((up7) parcel.readParcelable(cls2.getClassLoader()), (Uri) parcel.readParcelable(cls2.getClassLoader()));
            case LangUtils.HASH_SEED /*17*/:
                Class<s22> cls3 = s22.class;
                return new s22((up7) parcel.readParcelable(cls3.getClassLoader()), (Uri) parcel.readParcelable(cls3.getClassLoader()));
            case 18:
                return new t22((up7) parcel.readParcelable(t22.class.getClassLoader()), parcel.readString());
            case 19:
                return new l42(parcel);
            case 20:
                return new m42(parcel);
            case 21:
                return new n42(parcel);
            case 22:
                return new o42(parcel);
            case 23:
                return o92.valueOf(parcel.readString());
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return ih2.valueOf(parcel.readString());
            case 25:
                return kl2.valueOf(parcel.readString());
            case 26:
                return rl2.valueOf(parcel.readString());
            case 27:
                return new t43(parcel.readInt());
            case 28:
                return new e73(parcel);
            default:
                return new g73(parcel);
        }
    }

    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new e6[i];
            case 1:
                return new d8[i];
            case 2:
                return new w9[i];
            case 3:
                return new tl[i];
            case 4:
                return new ul[i];
            case 5:
                return new zn[i];
            case 6:
                return new uo[i];
            case 7:
                return new vo[i];
            case 8:
                return new ie0[i];
            case 9:
                return new je0[i];
            case 10:
                return new cg0[i];
            case 11:
                return new bk0[i];
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return new em0[i];
            case 13:
                return new fm0[i];
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new tx0[i];
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new gg1[i];
            case 16:
                return new r22[i];
            case LangUtils.HASH_SEED /*17*/:
                return new s22[i];
            case 18:
                return new t22[i];
            case 19:
                return new l42[i];
            case 20:
                return new m42[i];
            case 21:
                return new n42[i];
            case 22:
                return new o42[i];
            case 23:
                return new o92[i];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return new ih2[i];
            case 25:
                return new kl2[i];
            case 26:
                return new rl2[i];
            case 27:
                return new t43[i];
            case 28:
                return new e73[i];
            default:
                return new g73[i];
        }
    }
}
