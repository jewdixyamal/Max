package defpackage;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* renamed from: z72  reason: default package */
public final /* synthetic */ class z72 implements qj3, b7b, jm7, km7, b66, rj8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ z72(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public void accept(Object obj) {
        List<Long> list = this.b;
        switch (this.a) {
            case 0:
                u82 u82 = (u82) obj;
                for (Long put : list) {
                    u82.d().put(put, 0L);
                }
                return;
            case 1:
                u82 u822 = (u82) obj;
                for (Long remove : list) {
                    u822.d().remove(remove);
                }
                return;
            case 2:
                u82 u823 = (u82) obj;
                u823.getClass();
                for (Long remove2 : list) {
                    u823.R.remove(remove2);
                }
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                hm9.p("md5", String.format(Locale.ENGLISH, "onAssetsUpdate: failed to store stickers %s", new Object[]{list}), (Throwable) obj);
                return;
            case 16:
                hm9.p("md5", String.format(Locale.ENGLISH, "removeFromFavorites: failed: ids=%s", new Object[]{list}), (Throwable) obj);
                return;
            case 19:
                ((m20) obj).a = list;
                return;
            case 26:
                hm9.r("a4e", (Throwable) obj, "storeStickerSets: failed for sets = %s", list);
                return;
            default:
                hm9.m("eoe", "hasTasksByTypesInDb: tasks count=%d, for types=%s", (Long) obj, list);
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 6:
                return new sa3(1, new ec5((od5) obj, this.b, 0));
            case 7:
                return new sa3(1, new ec5((od5) obj, this.b, 1));
            case 8:
                od5 od5 = (od5) obj;
                od5.getClass();
                return new sa3(2, new nd5(od5, this.b, 1));
            case 9:
                return new qa3(((wc5) obj).a(), 2, new z72(12, this.b));
            case 10:
                return new qa3(((wc5) obj).a(), 2, new z72(14, this.b));
            case 11:
                return new qa3(((wc5) obj).a(), 2, new z72(12, this.b));
            case Protos.Attaches.Attach.PRESENT:
                return new sa3(1, new vc5((fd5) obj, this.b, 0));
            case 13:
                return new sa3(1, new vc5((fd5) obj, this.b, 1));
            case Protos.Attaches.Attach.LOCATION:
                fd5 fd5 = (fd5) obj;
                fd5.getClass();
                return new sa3(2, new ed5(fd5, this.b, 1));
            case 21:
                d9c d9c = (d9c) obj;
                d9c.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT * FROM recent WHERE recent_type IN (");
                List<t9c> list = this.b;
                int size = list.size();
                a14.c(sb, size);
                sb.append(") ORDER BY `recent_time` DESC");
                xlc a2 = xlc.a(size, sb.toString());
                int i = 1;
                for (t9c t9c : list) {
                    a2.j(i, (long) t9c.a);
                    i++;
                }
                b9c b9c = new b9c(d9c, a2, 4);
                return ngg.o((OneMeRoomDatabase) d9c.a, new String[]{"recent"}, b9c);
            case 22:
                return new ty9(new e0a(qy9.j((List) obj), new p4c(9), 3), new z72(20, this.b), 1).v().n();
            default:
                b4e b4e = (b4e) obj;
                b4e.getClass();
                return new sa3(2, new uh(b4e, 26, this.b));
        }
    }

    public void invoke(Object obj) {
        switch (this.a) {
            case 4:
                ((m3b) obj).k(this.b);
                return;
            default:
                ((n3b) obj).k(this.b);
                return;
        }
    }

    public Object k(ii8 ii8, oh8 oh8, int i) {
        switch (this.a) {
            case LangUtils.HASH_SEED:
                return ii8.k(oh8, (ffc) this.b);
            default:
                return ii8.k(oh8, (ffc) this.b);
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 3:
                return !nd7.c(this.b, new c10(((fs8) obj).a, 10));
            case 20:
                return this.b.contains(((h9c) obj).a);
            case 23:
                return !((Boolean) new vy9(qy9.j(this.b), new n2e(0, (Long) obj)).e()).booleanValue();
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                Map.Entry entry = (Map.Entry) obj;
                return this.b.contains(entry.getKey()) && entry.getValue() != null;
            default:
                return !((Boolean) new vy9(qy9.j(this.b), new n2e(1, (Long) obj)).e()).booleanValue();
        }
    }
}
