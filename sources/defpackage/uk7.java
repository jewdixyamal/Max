package defpackage;

import android.media.MediaDescription;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.view.View;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: uk7  reason: default package */
public final class uk7 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ uk7(int i) {
        this.a = i;
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [android.view.View$BaseSavedState, k18, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v17, types: [java.lang.Object, zh8] */
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        switch (this.a) {
            case 0:
                return new dl7(parcel2);
            case 1:
                return new rp7(parcel2);
            case 2:
                return new up7(parcel2);
            case 3:
                long readLong = parcel.readLong();
                Class<zp7> cls = zp7.class;
                Uri uri = (Uri) parcel2.readParcelable(cls.getClassLoader());
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                long readLong2 = parcel.readLong();
                Long l = null;
                Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() != 0) {
                    l = Long.valueOf(parcel.readLong());
                }
                return new zp7(readLong, uri, readString, readInt, readLong2, valueOf, l, parcel.readInt(), parcel.readInt(), parcel.readLong(), (Uri) parcel2.readParcelable(cls.getClassLoader()));
            case 4:
                return new jr7(parcel2);
            case 5:
                return new oy7(parcel2);
            case 6:
                ? baseSavedState = new View.BaseSavedState(parcel2);
                baseSavedState.a = ((Integer) parcel2.readValue(k18.class.getClassLoader())).intValue();
                return baseSavedState;
            case 7:
                return new j38(parcel2);
            case 8:
                return new k38(parcel2);
            case 9:
                return new p68(parcel2);
            case 10:
                ja8 a2 = ja8.a(MediaDescription.CREATOR.createFromParcel(parcel2));
                a2.getClass();
                return a2;
            case 11:
                return new hd8(parcel2);
            case Protos.Attaches.Attach.PRESENT:
                return new yh8(parcel2);
            case 13:
                ? obj = new Object();
                obj.a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel2);
                return obj;
            case Protos.Attaches.Attach.LOCATION:
                Parcelable readParcelable = parcel2.readParcelable((ClassLoader) null);
                readParcelable.getClass();
                return new ai8(readParcelable, (pr6) null);
            case Protos.Attaches.Attach.DAILY_MEDIA:
                Class<dn8> cls2 = dn8.class;
                return new dn8(parcel.readInt(), (jqe) parcel2.readParcelable(cls2.getClassLoader()), jfd.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (hfd) parcel2.readParcelable(cls2.getClassLoader()));
            case 16:
                return new go8(parcel.readLong(), ek2.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            case LangUtils.HASH_SEED:
                return new du8(parcel2);
            case 18:
                return new ew8(parcel2);
            case 19:
                return new xw8(parcel2);
            case 20:
                return new e99(parcel2);
            case 21:
                return new f99(parcel2);
            case 22:
                return new zb9(parcel2);
            case 23:
                return new ac9(parcel2);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return kc9.a(parcel.readInt(), parcel.readInt());
            case 25:
                return new uc9(parcel2);
            case 26:
                return new vc9(parcel2);
            case 27:
                return new ae9(parcel2);
            case 28:
                return new be9(parcel2);
            default:
                return new rk9(parcel2);
        }
    }

    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new dl7[i];
            case 1:
                return new rp7[i];
            case 2:
                return new up7[i];
            case 3:
                return new zp7[i];
            case 4:
                return new jr7[i];
            case 5:
                return new oy7[i];
            case 6:
                return new k18[i];
            case 7:
                return new j38[i];
            case 8:
                return new k38[i];
            case 9:
                return new p68[i];
            case 10:
                return new ja8[i];
            case 11:
                return new hd8[i];
            case Protos.Attaches.Attach.PRESENT:
                return new yh8[i];
            case 13:
                return new zh8[i];
            case Protos.Attaches.Attach.LOCATION:
                return new ai8[i];
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return new dn8[i];
            case 16:
                return new go8[i];
            case LangUtils.HASH_SEED:
                return new du8[i];
            case 18:
                return new ew8[i];
            case 19:
                return new xw8[i];
            case 20:
                return new e99[i];
            case 21:
                return new f99[i];
            case 22:
                return new zb9[i];
            case 23:
                return new ac9[i];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return new kc9[i];
            case 25:
                return new uc9[i];
            case 26:
                return new vc9[i];
            case 27:
                return new ae9[i];
            case 28:
                return new be9[i];
            default:
                return new rk9[i];
        }
    }
}
