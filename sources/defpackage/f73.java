package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: f73  reason: default package */
public final class f73 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ f73(int i) {
        this.a = i;
    }

    /* JADX WARNING: type inference failed for: r10v30, types: [android.view.ViewGroup$MarginLayoutParams, bn5, java.lang.Object, pdc] */
    /* JADX WARNING: type inference failed for: r10v31, types: [java.lang.Object, cn5] */
    /* JADX WARNING: type inference failed for: r10v32, types: [java.lang.Object, i16] */
    public final Object createFromParcel(Parcel parcel) {
        int i;
        switch (this.a) {
            case 0:
                return new h73(parcel);
            case 1:
                int readInt = parcel.readInt();
                jqe jqe = (jqe) parcel.readParcelable(mg3.class.getClassLoader());
                String readString = parcel.readString();
                if (readString != null) {
                    if (readString.equals("NEGATIVE")) {
                        i = 1;
                    } else if (readString.equals("NEUTRAL")) {
                        i = 2;
                    } else if (readString.equals("PRIMARY")) {
                        i = 3;
                    } else if (readString.equals("THEMED")) {
                        i = 4;
                    } else {
                        throw new IllegalArgumentException("No enum constant one.me.sdk.bottomsheet.ConfirmationBottomSheet.Button.Type.".concat(readString));
                    }
                    return new mg3(readInt, jqe, i, parcel.readInt() != 0);
                }
                throw new NullPointerException("Name is null");
            case 2:
                return new an3(parcel);
            case 3:
                return new tp3(parcel);
            case 4:
                return new nz3(parcel);
            case 5:
                int readInt2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                }
                int readInt3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt3);
                for (int i3 = 0; i3 != readInt3; i3++) {
                    arrayList2.add(parcel.readBundle(o04.class.getClassLoader()));
                }
                int readInt4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt4);
                for (int i4 = 0; i4 != readInt4; i4++) {
                    arrayList3.add(Long.valueOf(parcel.readLong()));
                }
                return new o04(arrayList, arrayList2, arrayList3, parcel.readInt());
            case 6:
                Parcelable.Creator<qte> creator = qte.CREATOR;
                return new m34(x34.CREATOR.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel));
            case 7:
                return new v34(parcel.readLong());
            case 8:
                return new x34(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readString());
            case 9:
                return new m64((Uri) parcel.readParcelable(m64.class.getClassLoader()));
            case 10:
                return new vo4(parcel);
            case 11:
                return new yq4(parcel);
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return new cr4(parcel);
            case 13:
                return new dr4(parcel);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new ar4(parcel);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new br4(parcel);
            case 16:
                return new ov4(parcel);
            case LangUtils.HASH_SEED /*17*/:
                return new c45(parcel);
            case 18:
                return new d45(parcel);
            case 19:
                return new bm5(parcel);
            case 20:
                ? pdc = new pdc(-2, -2);
                pdc.X = 0.0f;
                pdc.Y = 1.0f;
                pdc.Z = -1;
                pdc.s0 = -1.0f;
                pdc.v0 = 16777215;
                pdc.w0 = 16777215;
                pdc.X = parcel.readFloat();
                pdc.Y = parcel.readFloat();
                pdc.Z = parcel.readInt();
                pdc.s0 = parcel.readFloat();
                pdc.t0 = parcel.readInt();
                pdc.u0 = parcel.readInt();
                pdc.v0 = parcel.readInt();
                pdc.w0 = parcel.readInt();
                pdc.x0 = parcel.readByte() != 0;
                pdc.bottomMargin = parcel.readInt();
                pdc.leftMargin = parcel.readInt();
                pdc.rightMargin = parcel.readInt();
                pdc.topMargin = parcel.readInt();
                pdc.height = parcel.readInt();
                pdc.width = parcel.readInt();
                return pdc;
            case 21:
                ? obj = new Object();
                obj.a = parcel.readInt();
                obj.b = parcel.readInt();
                return obj;
            case 22:
                ? obj2 = new Object();
                obj2.a = parcel.readString();
                obj2.b = parcel.readInt();
                return obj2;
            case 23:
                return new o16(parcel);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new r16(parcel);
            case 25:
                return new q76(parcel.readInt());
            case 26:
                return new r76(parcel.readString());
            case 27:
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                boolean z4 = parcel.readInt() != 0;
                int readInt5 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt5);
                for (int i5 = 0; i5 != readInt5; i5++) {
                    arrayList4.add(parcel.readParcelable(d86.class.getClassLoader()));
                }
                return new d86(z, z2, z3, z4, arrayList4, parcel.readInt() != 0, parcel.readInt() != 0);
            case 28:
                return new qa6(parcel);
            default:
                return new ra6(parcel);
        }
    }

    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new h73[i];
            case 1:
                return new mg3[i];
            case 2:
                return new an3[i];
            case 3:
                return new tp3[i];
            case 4:
                return new nz3[i];
            case 5:
                return new o04[i];
            case 6:
                return new m34[i];
            case 7:
                return new v34[i];
            case 8:
                return new x34[i];
            case 9:
                return new m64[i];
            case 10:
                return new vo4[i];
            case 11:
                return new yq4[i];
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return new cr4[i];
            case 13:
                return new dr4[i];
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new ar4[i];
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new br4[i];
            case 16:
                return new ov4[i];
            case LangUtils.HASH_SEED /*17*/:
                return new c45[i];
            case 18:
                return new d45[i];
            case 19:
                return new bm5[i];
            case 20:
                return new bn5[i];
            case 21:
                return new cn5[i];
            case 22:
                return new i16[i];
            case 23:
                return new o16[i];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new r16[i];
            case 25:
                return new q76[i];
            case 26:
                return new r76[i];
            case 27:
                return new d86[i];
            case 28:
                return new qa6[i];
            default:
                return new ra6[i];
        }
    }
}
