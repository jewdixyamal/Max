package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: etd  reason: default package */
public final class etd implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ etd(int i) {
        this.a = i;
    }

    /* JADX WARNING: type inference failed for: r6v11, types: [java.lang.Object, oxd] */
    /* JADX WARNING: type inference failed for: r6v12, types: [java.lang.Object, pxd] */
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new gtd(parcel.readLong(), parcel.readLong(), parcel.readInt());
            case 1:
                return new dud(parcel);
            case 2:
                return new eud(parcel);
            case 3:
                return new zvd(parcel);
            case 4:
                return new awd(parcel);
            case 5:
                return new Object();
            case 6:
                return new Object();
            case 7:
                return new hwd(parcel);
            case 8:
                return new iwd(parcel);
            case 9:
                ? obj = new Object();
                obj.a = parcel.readInt();
                obj.b = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                obj.o = z;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    obj.c = iArr;
                    parcel.readIntArray(iArr);
                }
                return obj;
            case 10:
                ? obj2 = new Object();
                obj2.a = parcel.readInt();
                obj2.b = parcel.readInt();
                int readInt2 = parcel.readInt();
                obj2.c = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    obj2.o = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                obj2.X = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    obj2.Y = iArr3;
                    parcel.readIntArray(iArr3);
                }
                boolean z2 = false;
                obj2.s0 = parcel.readInt() == 1;
                obj2.t0 = parcel.readInt() == 1;
                if (parcel.readInt() == 1) {
                    z2 = true;
                }
                obj2.u0 = z2;
                obj2.Z = parcel.readArrayList(oxd.class.getClassLoader());
                return obj2;
            case 11:
                return pyd.valueOf(parcel.readString());
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return new w8e(parcel);
            case 13:
                return new x8e(parcel);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                SparseArray sparseArray = new SparseArray();
                int readInt4 = parcel.readInt();
                for (int i = 0; i < readInt4; i++) {
                    sparseArray.put(parcel.readInt(), parcel.readString());
                }
                return new t9e(sparseArray);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new ipe(parcel);
            case 16:
                String readString = parcel.readString();
                readString.getClass();
                String readString2 = parcel.readString();
                String[] createStringArray = parcel.createStringArray();
                createStringArray.getClass();
                return new jpe(readString, readString2, zw6.k(createStringArray));
            case LangUtils.HASH_SEED /*17*/:
                return new qte(parcel.readInt());
            case 18:
                return new xte(parcel.readLong(), parcel.readLong());
            case 19:
                return new yte(parcel.readLong(), parcel.readLong());
            case 20:
                return new mze(parcel);
            case 21:
                return new lze(parcel);
            case 22:
                return new h9f(parcel);
            case 23:
                return new i9f(parcel);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                parcel.readInt();
                return zdf.a;
            case 25:
                return new aef(xdf.valueOf(parcel.readString()));
            case 26:
                parcel.readInt();
                return mkf.a;
            case 27:
                return new nkf(mqb.valueOf(parcel.readString()));
            case 28:
                return new zqf(parcel);
            default:
                return new xqf(parcel);
        }
    }

    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new gtd[i];
            case 1:
                return new dud[i];
            case 2:
                return new eud[i];
            case 3:
                return new zvd[i];
            case 4:
                return new awd[i];
            case 5:
                return new bwd[i];
            case 6:
                return new cwd[i];
            case 7:
                return new hwd[i];
            case 8:
                return new iwd[i];
            case 9:
                return new oxd[i];
            case 10:
                return new pxd[i];
            case 11:
                return new pyd[i];
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return new w8e[i];
            case 13:
                return new x8e[i];
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new t9e[i];
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new ipe[i];
            case 16:
                return new jpe[i];
            case LangUtils.HASH_SEED /*17*/:
                return new qte[i];
            case 18:
                return new xte[i];
            case 19:
                return new yte[i];
            case 20:
                return new mze[i];
            case 21:
                return new lze[i];
            case 22:
                return new h9f[i];
            case 23:
                return new i9f[i];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new zdf[i];
            case 25:
                return new aef[i];
            case 26:
                return new mkf[i];
            case 27:
                return new nkf[i];
            case 28:
                return new wqf[i];
            default:
                return new xqf[i];
        }
    }
}
