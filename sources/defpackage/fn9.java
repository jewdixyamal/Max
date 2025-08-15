package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: fn9  reason: default package */
public final class fn9 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ fn9(int i) {
        this.a = i;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.view.View$BaseSavedState, gn9, java.lang.Object] */
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        switch (this.a) {
            case 0:
                ? baseSavedState = new View.BaseSavedState(parcel2);
                baseSavedState.a = parcel.readInt();
                return baseSavedState;
            case 1:
                return new qo9(parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
            case 2:
                return new e4a(parcel2);
            case 3:
                return new eaa(parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            case 4:
                return new dia(parcel.readInt());
            case 5:
                return new eia(dia.CREATOR.createFromParcel(parcel2).a, parcel.readInt(), parcel.readInt());
            case 6:
                Class<uia> cls = uia.class;
                Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
                return new uia((oia) parcel2.readParcelable(cls.getClassLoader()), (CharSequence) creator.createFromParcel(parcel2), (CharSequence) creator.createFromParcel(parcel2), (tia) parcel2.readParcelable(cls.getClassLoader()), eia.CREATOR.createFromParcel(parcel2), (iia) parcel2.readParcelable(cls.getClassLoader()));
            case 7:
                parcel.readInt();
                return fia.b;
            case 8:
                parcel.readInt();
                return gia.b;
            case 9:
                parcel.readInt();
                return hia.b;
            case 10:
                return new jia(parcel.readInt(), parcel.readInt());
            case 11:
                return new kia(parcel.readInt());
            case Protos.Attaches.Attach.PRESENT /*12*/:
                parcel.readInt();
                return lia.a;
            case 13:
                return new mia(parcel.readInt());
            case Protos.Attaches.Attach.LOCATION /*14*/:
                parcel.readInt();
                return nia.a;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                parcel.readInt();
                return pia.a;
            case 16:
                parcel.readInt();
                return qia.a;
            case LangUtils.HASH_SEED /*17*/:
                parcel.readInt();
                return ria.a;
            case 18:
                return new sia((jqe) parcel2.readParcelable(sia.class.getClassLoader()));
            case 19:
                return new ParcelImpl(parcel2);
            case 20:
                return new upa(parcel2);
            case 21:
                return new vsa(parcel.readString(), parcel.createStringArray(), parcel.readInt());
            case 22:
                Class<Uri> cls2 = Uri.class;
                return new awa((Uri) parcel2.readParcelable(cls2.getClassLoader()), (Uri) parcel2.readParcelable(cls2.getClassLoader()), (nz3) parcel2.readParcelable(nz3.class.getClassLoader()), (ov4) parcel2.readParcelable(ov4.class.getClassLoader()), (Uri) parcel2.readParcelable(cls2.getClassLoader()));
            case 23:
                return new cwa(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new rza(parcel2);
            case 25:
                return new sza(parcel2);
            case 26:
                return new i3b(parcel2);
            case 27:
                return new h3b(parcel2);
            case 28:
                return new x7b(parcel2);
            default:
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashMap.put(Integer.valueOf(parcel.readInt()), parcel.readString());
                }
                int readInt2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    arrayList.add(qo9.CREATOR.createFromParcel(parcel2));
                }
                return new e8b(linkedHashMap, arrayList, parcel.readInt() == 0 ? null : qo9.CREATOR.createFromParcel(parcel2));
        }
    }

    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new gn9[i];
            case 1:
                return new qo9[i];
            case 2:
                return new e4a[i];
            case 3:
                return new eaa[i];
            case 4:
                return new dia[i];
            case 5:
                return new eia[i];
            case 6:
                return new uia[i];
            case 7:
                return new fia[i];
            case 8:
                return new gia[i];
            case 9:
                return new hia[i];
            case 10:
                return new jia[i];
            case 11:
                return new kia[i];
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return new lia[i];
            case 13:
                return new mia[i];
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new nia[i];
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new pia[i];
            case 16:
                return new qia[i];
            case LangUtils.HASH_SEED /*17*/:
                return new ria[i];
            case 18:
                return new sia[i];
            case 19:
                return new ParcelImpl[i];
            case 20:
                return new upa[i];
            case 21:
                return new vsa[i];
            case 22:
                return new awa[i];
            case 23:
                return new cwa[i];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new rza[i];
            case 25:
                return new sza[i];
            case 26:
                return new i3b[i];
            case 27:
                return new h3b[i];
            case 28:
                return new x7b[i];
            default:
                return new e8b[i];
        }
    }
}
