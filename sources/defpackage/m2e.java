package defpackage;

import java.util.ArrayList;
import java.util.List;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* renamed from: m2e  reason: default package */
public final /* synthetic */ class m2e implements ol0, b66, qj3, b7b, qc7 {
    public final /* synthetic */ int a;

    public /* synthetic */ m2e(int i) {
        this.a = i;
    }

    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((List) obj).addAll((List) obj2);
                return;
            default:
                ((ArrayList) obj).addAll((List) obj2);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r2v18, types: [java.lang.Object, k3e] */
    /* JADX WARNING: type inference failed for: r2v21, types: [r3e, java.lang.Object] */
    public Object apply(Object obj) {
        m28 m28 = m28.a;
        switch (this.a) {
            case 2:
                return ((eu) obj).c;
            case 3:
                ArrayList arrayList = new ArrayList();
                for (e2e r : (List) obj) {
                    arrayList.add(iz7.r(r));
                }
                return arrayList;
            case 6:
                return Long.valueOf(((j3e) obj).c);
            case 10:
                return ((p2e) obj).c;
            case 11:
                return iz7.r((e2e) obj);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return ((eu) obj).o;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                List list = (List) obj;
                return list.isEmpty() ? m28 : f28.e((q3e) list.get(0));
            case 16:
                return Long.valueOf(((m3e) obj).a);
            case LangUtils.HASH_SEED /*17*/:
                b4e b4e = (b4e) obj;
                b4e.getClass();
                return new sa3(2, new ia4(13, b4e));
            case 18:
                List list2 = (List) obj;
                return list2.isEmpty() ? m28 : f28.e((q3e) list2.get(0));
            case 19:
                r3e r3e = (r3e) obj;
                long j = r3e.a;
                ? obj2 = new Object();
                obj2.a = j;
                obj2.b = r3e.b;
                obj2.c = r3e.c;
                obj2.d = r3e.d;
                obj2.e = r3e.e;
                obj2.f = r3e.f;
                obj2.g = r3e.g;
                obj2.h = r3e.h;
                obj2.i = r3e.i;
                return new q3e(obj2);
            case 20:
                List list3 = (List) obj;
                return list3.isEmpty() ? m28 : f28.e(list3);
            case 21:
                return ((OneMeRoomDatabase) obj).R();
            default:
                q3e q3e = (q3e) obj;
                ? obj3 = new Object();
                obj3.a = q3e.a;
                obj3.b = q3e.b;
                obj3.c = q3e.c;
                obj3.d = q3e.d;
                obj3.e = q3e.e;
                obj3.f = q3e.f;
                obj3.g = q3e.g;
                obj3.h = q3e.h;
                obj3.i = q3e.i;
                return obj3;
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 5:
                return ((h9c) obj).a == t9c.STICKER;
            case 26:
                return ((wua) obj).Y != 0;
            default:
                return fme.a(((Integer) obj).intValue());
        }
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 4:
                hm9.p("o2e", "onStickersLoadedFromNetwork: write to stickers db failed", (Throwable) obj);
                return;
            case 7:
                hm9.p("o2e", "Can't update recents", (Throwable) obj);
                return;
            case 8:
                hm9.p("o2e", "load: failed", (Throwable) obj);
                return;
            case 9:
                hm9.p("o2e", "clear: failed to clear repository", (Throwable) obj);
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                hm9.p("q2e", "createSticker: failed", (Throwable) obj);
                return;
            case 13:
                hm9.p("a4e", "clear: repository clear failed", (Throwable) obj);
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                hm9.p("ede", "Got error during handling event", (Throwable) obj);
                return;
            case 25:
                hm9.p("ede", "loadBotCommands: exception", (Throwable) obj);
                return;
            case 27:
                Integer num = (Integer) obj;
                hm9.k("fme", "retryWhenCommonError: connected");
                return;
            default:
                Integer num2 = (Integer) obj;
                hm9.k("fme", "retryWhenCommonErrorObs: connected");
                return;
        }
    }
}
