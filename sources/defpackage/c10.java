package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: c10  reason: default package */
public final /* synthetic */ class c10 implements qj3, b7b, b66, pj3, eqc {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ c10() {
        this.a = 19;
        this.b = 0;
    }

    public void accept(Object obj) {
        long j = this.b;
        switch (this.a) {
            case 0:
                tpa.L((j10) obj, d20.o, j);
                return;
            case 1:
                u82 u82 = (u82) obj;
                u82.L = j;
                u82.M = false;
                return;
            case 2:
                u82 u822 = (u82) obj;
                b92 b92 = u822.p;
                if (b92 == null) {
                    b92 = b92.h;
                }
                a92 a2 = b92.a();
                a2.a = j;
                u822.p = new b92(a2);
                return;
            case 3:
                u82 u823 = (u82) obj;
                b92 b922 = u823.p;
                if (b922 == null) {
                    b922 = b92.h;
                }
                a92 a3 = b922.a();
                a3.e = j;
                u823.p = new b92(a3);
                return;
            case 4:
                ((u82) obj).x = j;
                return;
            case 5:
                u82 u824 = (u82) obj;
                if (u824.Y < j || j == 0) {
                    u824.Y = j;
                    return;
                }
                return;
            case 6:
                u82 u825 = (u82) obj;
                e92 e92 = u825.n;
                mg4 mg4 = mg4.REGULAR;
                ArrayList h = hm9.h(e92, j, mg4);
                u825.n.d(mg4).clear();
                e92.e(mg4);
                u825.n.d(mg4).addAll(h);
                e92.e(mg4);
                u825.Z = 0;
                x82 x82 = x82.f;
                u825.q = x82;
                u825.r = x82;
                u825.s = x82;
                u825.t = x82;
                u825.u = x82;
                u825.v = x82;
                u825.w = x82;
                j92 j92 = u825.b;
                if (j92 == j92.b || (j92 == j92.a && j == u825.k)) {
                    u825.j = 0;
                    u825.m = 0;
                    u825.q = null;
                    u825.r = null;
                    u825.u = null;
                    u825.t = null;
                    u825.s = null;
                    u825.v = null;
                    u825.w = null;
                    return;
                }
                return;
            case 7:
                ((u82) obj).f = j;
                return;
            case 8:
                u82 u826 = (u82) obj;
                b92 b923 = u826.p;
                if (b923 == null) {
                    b923 = b92.h;
                }
                a92 a4 = b923.a();
                a4.d = j;
                u826.p = new b92(a4);
                return;
            case 9:
                u82 u827 = (u82) obj;
                if (u827.Z < j) {
                    u827.Z = j;
                    return;
                }
                return;
            case 11:
                ((hl3) obj).r = j;
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                ((hl3) obj).t = j;
                return;
            case 13:
                hl3 hl3 = (hl3) obj;
                hl3.j = 2;
                hl3.s = j;
                return;
            case LangUtils.HASH_SEED /*17*/:
                Locale locale = Locale.ENGLISH;
                hm9.p("sc5", "loadFromMarker: failed to load from marker=" + j, (Throwable) obj);
                return;
            case 18:
                Locale locale2 = Locale.ENGLISH;
                hm9.p("dd5", "assetsUpdate: failed request, sync=" + j, (Throwable) obj);
                return;
            case 19:
                Locale locale3 = Locale.ENGLISH;
                hm9.p("hd5", "assetsUpdate: failed request, sync=" + j, (Throwable) obj);
                return;
            case 22:
                Locale locale4 = Locale.ENGLISH;
                hm9.p("md5", "loadFromMarker: failed to load from marker=" + j, (Throwable) obj);
                return;
            case 23:
                ((x4b) obj).seekTo(j);
                return;
            default:
                Locale locale5 = Locale.ENGLISH;
                hm9.p("fk9", "Can't load track for message " + j, (Throwable) obj);
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new qa3(((wc5) obj).a(), 2, new bc5(3, this.b, true));
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                List list = (List) obj;
                return list.isEmpty() ? iqd.g(Boolean.FALSE) : new vy9(new q28(iqd.g(list), new jj9(2), 3), new c10(this.b, 16));
            case 20:
                List list2 = (List) obj;
                return list2.isEmpty() ? iqd.g(Boolean.FALSE) : new vy9(new q28(iqd.g(list2), new jj9(2), 3), new c10(this.b, 21));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                oy8 oy8 = (oy8) obj;
                oy8.getClass();
                xlc a2 = xlc.a(1, "SELECT * FROM message_uploads WHERE message_id = ?");
                a2.j(1, this.b);
                return new t28(new ny8(oy8, a2, 1));
            case 26:
                Cursor cursor = (Cursor) obj;
                cursor.moveToNext();
                return new aue(cursor.getLong(0), this.b);
            default:
                w8f w8f = (w8f) obj;
                w8f.getClass();
                return new sa3(2, new td5(w8f, this.b, 4));
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 10:
                return ((ve9) ((une) obj).f).Z == this.b;
            case 16:
                return ((m3e) obj).a == this.b;
            case 21:
                return ((d2e) obj).a == this.b;
            case 27:
                kzc kzc = (kzc) obj;
                e52 e52 = kzc.o;
                return e52 != null && e52.M() && kzc.o.l().n() == this.b;
            default:
                return ((p8f) obj).b == this.b;
        }
    }

    public /* synthetic */ c10(long j, int i) {
        this.a = i;
        this.b = j;
    }
}
