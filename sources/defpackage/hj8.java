package defpackage;

import android.graphics.drawable.Drawable;
import java.util.List;
import one.me.messages.settings.MessagesSettingsScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* renamed from: hj8  reason: default package */
public final /* synthetic */ class hj8 implements pj3, rj8, w56, qj3, b66, o1d, xs6, ys6, qa5, ra5 {
    public final /* synthetic */ int a;

    public /* synthetic */ hj8(int i) {
        this.a = i;
    }

    public ka5[] a() {
        return new ka5[]{new vd9()};
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((x4b) obj).E();
                return;
            case 2:
                ((x4b) obj).v();
                return;
            case 9:
                Drawable drawable = ts8.V0;
                hm9.p("ts8", "Can't save file", (Throwable) obj);
                return;
            case 11:
                m20 m20 = (m20) obj;
                for (int i = 0; i < m20.b(); i++) {
                    j10 j = m20.d(i).j();
                    j.i = d20.a;
                    j.k = 0.0f;
                    m20.e(i, j.a());
                }
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                hm9.p("au8", "cancelUploadAttachAcync: failed", (Throwable) obj);
                return;
            case 13:
                j10 j10 = (j10) obj;
                j10.k = 0.0f;
                j10.o = 0;
                j10.p = 0;
                return;
            case 27:
                ((j10) obj).i = d20.c;
                return;
            case 28:
                Throwable th = (Throwable) obj;
                hm9.o("lj9", "Can't hide controls");
                return;
            default:
                Throwable th2 = (Throwable) obj;
                hm9.o("lj9", "Can't update not started live video");
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 6:
                return Long.valueOf(((b04) obj).b);
            case 7:
                return Long.valueOf(((b04) obj).c);
            case 8:
                return zw6.j(br7.Z(new hme(16), ((zd8) obj).q().b));
            case 10:
                return String.valueOf((Long) obj);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                oy8 oy8 = (oy8) obj;
                oy8.getClass();
                return new t28(new ny8(oy8, xlc.a(0, "SELECT * FROM message_uploads"), 0));
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return f8.o((ky8) obj);
            case 16:
                List list = (List) obj;
                return list.isEmpty() ? m28.a : f28.e(list);
            case LangUtils.HASH_SEED /*17*/:
                List list2 = (List) obj;
                return list2.isEmpty() ? m28.a : f28.e(list2);
            case 18:
                oy8 oy82 = (oy8) obj;
                oy82.getClass();
                return new sa3(2, new ia4(7, oy82));
            case 19:
                return ((OneMeRoomDatabase) obj).E();
            case 23:
                return (jze) obj;
            default:
                return (kze) obj;
        }
    }

    public boolean c(int i, int i2, int i3, int i4, int i5) {
        switch (this.a) {
            case 21:
                return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
            default:
                return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
        }
    }

    public void e(x4b x4b, ph8 ph8) {
        j47.m0(x4b, ph8);
    }

    public int i(int i) {
        bc7[] bc7Arr = MessagesSettingsScreen.Y;
        return 4;
    }

    public Object k(ii8 ii8, oh8 oh8, int i) {
        switch (this.a) {
            case 1:
                au1.r(ii8);
                throw null;
            case 3:
                au1.r(ii8);
                throw null;
            default:
                ii8.s(oh8);
                ii8.e.getClass();
                return fm9.F(new sad(-6));
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public la5[] m20a() {
        return new la5[]{new wd9(16, mbe.a0)};
    }
}
