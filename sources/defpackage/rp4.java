package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: rp4  reason: default package */
public final class rp4 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ rp4(Object obj, long j, String str, int i) {
        this.a = i;
        this.o = obj;
        this.b = j;
        this.c = str;
    }

    /* JADX INFO: finally extract failed */
    public final Object call() {
        switch (this.a) {
            case 0:
                tp4 tp4 = (tp4) this.o;
                th thVar = tp4.c;
                ilc ilc = tp4.a;
                q36 f = thVar.f();
                f.j(1, this.b);
                String str = (String) this.c;
                if (str == null) {
                    f.W(2);
                } else {
                    f.f(2, str);
                }
                try {
                    ilc.c();
                    f.n();
                    ilc.r();
                    ilc.l();
                    thVar.t(f);
                    return null;
                } catch (Throwable th) {
                    thVar.t(f);
                    throw th;
                }
            case 1:
                StringBuilder l = au1.l("DELETE FROM messages WHERE chat_id = ? AND id in (");
                List<Long> list = (List) this.c;
                a14.c(l, list.size());
                l.append(")");
                String sb = l.toString();
                t19 t19 = (t19) this.o;
                q36 d = t19.a.d(sb);
                d.j(1, this.b);
                int i = 2;
                for (Long l2 : list) {
                    if (l2 == null) {
                        d.W(i);
                    } else {
                        d.j(i, l2.longValue());
                    }
                    i++;
                }
                ilc ilc2 = t19.a;
                ilc2.c();
                try {
                    d.n();
                    ilc2.r();
                    ilc2.l();
                    return e5f.a;
                } catch (Throwable th2) {
                    ilc2.l();
                    throw th2;
                }
            case 2:
                alc alc = (alc) this.o;
                zkc zkc = alc.f;
                ilc ilc3 = alc.a;
                q36 f2 = zkc.f();
                f2.j(1, this.b);
                String str2 = (String) this.c;
                if (str2 == null) {
                    f2.W(2);
                } else {
                    f2.f(2, str2);
                }
                try {
                    ilc3.c();
                    f2.m();
                    ilc3.r();
                    ilc3.l();
                    zkc.t(f2);
                    return e5f.a;
                } catch (Throwable th3) {
                    zkc.t(f2);
                    throw th3;
                }
            default:
                StringBuilder l3 = au1.l("DELETE FROM folder_and_chats WHERE folderId IN (");
                Collection<String> collection = (Collection) this.c;
                int size = collection.size();
                a14.c(l3, size);
                l3.append(") AND chatId = ");
                l3.append("?");
                String sb2 = l3.toString();
                alc alc2 = (alc) this.o;
                q36 d2 = alc2.a.d(sb2);
                int i2 = 1;
                for (String str3 : collection) {
                    if (str3 == null) {
                        d2.W(i2);
                    } else {
                        d2.f(i2, str3);
                    }
                    i2++;
                }
                d2.j(size + 1, this.b);
                ilc ilc4 = alc2.a;
                ilc4.c();
                try {
                    d2.n();
                    ilc4.r();
                    ilc4.l();
                    return e5f.a;
                } catch (Throwable th4) {
                    ilc4.l();
                    throw th4;
                }
        }
    }

    public /* synthetic */ rp4(Object obj, Collection collection, long j, int i) {
        this.a = i;
        this.o = obj;
        this.c = collection;
        this.b = j;
    }
}
