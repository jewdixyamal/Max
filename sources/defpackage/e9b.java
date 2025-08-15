package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import java.util.ArrayList;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.util.share.ShareData;
import ru.ok.tamtam.nano.Protos;

/* renamed from: e9b  reason: default package */
public final class e9b implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ e9b(int i) {
        this.a = i;
    }

    public final Object createFromParcel(Parcel parcel) {
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Parcel parcel2 = parcel;
        switch (this.a) {
            case 0:
                return new f9b(parcel2);
            case 1:
                return new g9b(parcel2);
            case 2:
                return new i9b(parcel2);
            case 3:
                return new j9b(parcel2);
            case 4:
                return hdb.valueOf(parcel.readString());
            case 5:
                return rdb.valueOf(parcel.readString());
            case 6:
                return qeb.valueOf(parcel.readString());
            case 7:
                return reb.valueOf(parcel.readString());
            case 8:
                return new bqb(parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readLong(), parcel.readString(), parcel.readLong(), rl2.CREATOR.createFromParcel(parcel2));
            case 9:
                return new qqb(new nqb(mqb.values()[parcel.readInt()], parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong(), Byte.valueOf(parcel.readByte()).equals(1)));
            case 10:
                return new h5c(parcel.readInt(), parcel.readFloat());
            case 11:
                return new afc(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            case Protos.Attaches.Attach.PRESENT /*12*/:
                int d0 = br7.d0(parcel);
                Bundle bundle = null;
                while (parcel.dataPosition() < d0) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 2) {
                        br7.X(parcel2, readInt);
                    } else {
                        bundle = br7.n(parcel2, readInt);
                    }
                }
                br7.s(parcel2, d0);
                return new wfc(bundle);
            case 13:
                return new zhc(parcel.readInt());
            case Protos.Attaches.Attach.LOCATION /*14*/:
                int readInt2 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    arrayList5.add(Long.valueOf(parcel.readLong()));
                }
                int readInt3 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt3);
                for (int i3 = 0; i3 != readInt3; i3++) {
                    arrayList6.add(parcel2.readBundle(boc.class.getClassLoader()));
                }
                int readInt4 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(readInt4);
                for (int i4 = 0; i4 != readInt4; i4++) {
                    arrayList7.add(Long.valueOf(parcel.readLong()));
                }
                return new boc(arrayList5, arrayList6, arrayList7, parcel.readInt());
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new itc(parcel2.readParcelable(itc.class.getClassLoader()));
            case 16:
                return new jtc(m34.CREATOR.createFromParcel(parcel2), parcel.readInt() != 0, parcel2.readParcelable(jtc.class.getClassLoader()));
            case LangUtils.HASH_SEED /*17*/:
                return new suc(parcel.readString());
            case 18:
                Class<ozc> cls = ozc.class;
                return new ozc((ForegroundColorSpan) parcel2.readParcelable(cls.getClassLoader()), (BackgroundColorSpan) parcel2.readParcelable(cls.getClassLoader()));
            case 19:
                Class<q4d> cls2 = q4d.class;
                return new q4d(zp7.CREATOR.createFromParcel(parcel2), parcel.readInt() != 0, (Uri) parcel2.readParcelable(cls2.getClassLoader()), (Uri) parcel2.readParcelable(cls2.getClassLoader()), parcel.readString(), (RectF) parcel2.readParcelable(cls2.getClassLoader()), (Rect) parcel2.readParcelable(cls2.getClassLoader()), (Uri) parcel2.readParcelable(cls2.getClassLoader()));
            case 20:
                int readInt5 = parcel.readInt();
                jqe jqe = (jqe) parcel2.readParcelable(fed.class.getClassLoader());
                String readString = parcel.readString();
                if (readString != null) {
                    if (readString.equals("LINK")) {
                        i = 1;
                    } else if (readString.equals("NEUTRAL")) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("No enum constant one.me.settings.SettingsAvatarBottomSheet.Button.Type.".concat(readString));
                    }
                    return new fed(readInt5, i, jqe);
                }
                throw new NullPointerException("Name is null");
            case 21:
                parcel.readInt();
                return cfd.a;
            case 22:
                return new dfd((jqe) parcel2.readParcelable(dfd.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            case 23:
                boolean z = false;
                boolean z2 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                return new efd(z2, z);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                boolean z3 = false;
                boolean z4 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z3 = true;
                }
                return new ffd(z4, z3);
            case 25:
                return new gfd((jqe) parcel2.readParcelable(gfd.class.getClassLoader()));
            case 26:
                int readInt6 = parcel.readInt();
                Class<ShareData> cls3 = ShareData.class;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt7 = parcel.readInt();
                    arrayList = new ArrayList(readInt7);
                    for (int i5 = 0; i5 != readInt7; i5++) {
                        arrayList.add(parcel2.readParcelable(cls3.getClassLoader()));
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int readInt8 = parcel.readInt();
                    arrayList2 = new ArrayList(readInt8);
                    for (int i6 = 0; i6 != readInt8; i6++) {
                        arrayList2.add(parcel2.readParcelable(cls3.getClassLoader()));
                    }
                }
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList3 = null;
                } else {
                    int readInt9 = parcel.readInt();
                    arrayList3 = new ArrayList(readInt9);
                    for (int i7 = 0; i7 != readInt9; i7++) {
                        arrayList3.add(parcel2.readParcelable(cls3.getClassLoader()));
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList4 = null;
                } else {
                    int readInt10 = parcel.readInt();
                    arrayList4 = new ArrayList(readInt10);
                    for (int i8 = 0; i8 != readInt10; i8++) {
                        arrayList4.add(parcel2.readParcelable(cls3.getClassLoader()));
                    }
                }
                return new ShareData(readInt6, arrayList, arrayList2, readString2, arrayList3, arrayList4, parcel.readString());
            case 27:
                ArrayList arrayList8 = new ArrayList();
                parcel2.readList(arrayList8, ftd.class.getClassLoader());
                return new htd(arrayList8);
            case 28:
                ArrayList arrayList9 = new ArrayList();
                parcel2.readList(arrayList9, gtd.class.getClassLoader());
                return new itd(arrayList9);
            default:
                return new ftd(parcel.readLong(), parcel.readLong(), parcel.readInt());
        }
    }

    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new f9b[i];
            case 1:
                return new g9b[i];
            case 2:
                return new i9b[i];
            case 3:
                return new j9b[i];
            case 4:
                return new hdb[i];
            case 5:
                return new rdb[i];
            case 6:
                return new qeb[i];
            case 7:
                return new reb[i];
            case 8:
                return new bqb[i];
            case 9:
                return new qqb[i];
            case 10:
                return new h5c[i];
            case 11:
                return new afc[i];
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return new wfc[i];
            case 13:
                return new zhc[i];
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new boc[i];
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new itc[i];
            case 16:
                return new jtc[i];
            case LangUtils.HASH_SEED /*17*/:
                return new suc[i];
            case 18:
                return new ozc[i];
            case 19:
                return new q4d[i];
            case 20:
                return new fed[i];
            case 21:
                return new cfd[i];
            case 22:
                return new dfd[i];
            case 23:
                return new efd[i];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new ffd[i];
            case 25:
                return new gfd[i];
            case 26:
                return new ShareData[i];
            case 27:
                return new htd[i];
            case 28:
                return new itd[i];
            default:
                return new ftd[i];
        }
    }
}
