package defpackage;

import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* renamed from: b74  reason: default package */
public final /* synthetic */ class b74 implements km7, jm7, qj3, b66 {
    public final /* synthetic */ int a;

    public /* synthetic */ b74(int i) {
        this.a = i;
    }

    public void accept(Object obj) {
        hm9.p("ga4", "clear: failed to clear repository", (Throwable) obj);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 28:
                ja4 ja4 = (ja4) obj;
                ja4.getClass();
                return new sa3(2, new ia4(0, ja4));
            default:
                return ((OneMeRoomDatabase) obj).y();
        }
    }

    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((gd) obj).getClass();
                return;
            case 1:
                ((u65) obj).getClass();
                return;
            case 2:
                ((u65) obj).getClass();
                return;
            case 3:
                ((u65) obj).getClass();
                return;
            case 4:
                ((u65) obj).getClass();
                return;
            case 5:
                ((gd) obj).getClass();
                return;
            case 6:
                ((u65) obj).getClass();
                return;
            case 7:
                ((gd) obj).getClass();
                return;
            case 8:
                ((u65) obj).getClass();
                return;
            case 9:
                ((u65) obj).getClass();
                return;
            case 10:
                ((u65) obj).getClass();
                return;
            case 11:
                ((u65) obj).getClass();
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                ((u65) obj).getClass();
                return;
            case 13:
                ((u65) obj).getClass();
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                ((gd) obj).getClass();
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                ((gd) obj).getClass();
                return;
            case 16:
                ((u65) obj).getClass();
                return;
            case LangUtils.HASH_SEED /*17*/:
                ((gd) obj).getClass();
                return;
            case 18:
                ((u65) obj).getClass();
                return;
            case 19:
                ((gd) obj).getClass();
                return;
            case 20:
                ((u65) obj).getClass();
                return;
            case 21:
                ((gd) obj).getClass();
                return;
            case 22:
                ((u65) obj).getClass();
                return;
            case 23:
                ((gd) obj).getClass();
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                ((u65) obj).getClass();
                return;
            case 25:
                ((u65) obj).getClass();
                return;
            default:
                ((u65) obj).getClass();
                return;
        }
    }

    public /* synthetic */ b74(ed edVar, int i) {
        this.a = 4;
    }

    public /* synthetic */ b74(ed edVar, Object obj, int i) {
        this.a = i;
    }

    public /* synthetic */ b74(ed edVar, boolean z) {
        this.a = 9;
    }

    public /* synthetic */ b74(fd fdVar, yn7 yn7, pc8 pc8, int i) {
        this.a = i;
    }
}
