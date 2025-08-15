package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.ok.tamtam.search.MainSearchLoaderImpl$NotFoundException;

/* renamed from: sx7  reason: default package */
public final /* synthetic */ class sx7 implements qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx7 b;
    public final /* synthetic */ String c;

    public /* synthetic */ sx7(yx7 yx7, String str, int i) {
        this.a = i;
        this.b = yx7;
        this.c = str;
    }

    public final void accept(Object obj) {
        String str = this.c;
        yx7 yx7 = this.b;
        switch (this.a) {
            case 0:
                sq2 sq2 = (sq2) obj;
                yx7.getClass();
                List<nx8> list = sq2.c;
                ArrayList arrayList = new ArrayList(list.size());
                for (nx8 nx8 : list) {
                    try {
                        fs8 fs8 = nx8.b;
                        List list2 = nx8.o;
                        arrayList.add(new kzc(3, nx8.c, (ArrayList) list2, (e52) null, (uj3) null, fs8, nx8.a, (vpb) null));
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
                yx7.n.addAll(arrayList);
                ArrayList arrayList2 = yx7.q;
                arrayList2.addAll(arrayList);
                String str2 = sq2.X;
                if (str2 == null || !str2.equals("0")) {
                    yx7.s = sq2.X;
                } else {
                    yx7.s = null;
                }
                px7 px7 = yx7.i;
                if (px7 != null) {
                    px7.c(str, yx7.n);
                    px7 px72 = yx7.i;
                    new ArrayList(arrayList2);
                    px72.getClass();
                    return;
                }
                return;
            case 1:
                Throwable th2 = (Throwable) obj;
                yx7.getClass();
                hm9.p("yx7", "searchChatsAndMessages: exception", th2);
                yx7.g.a(new MainSearchLoaderImpl$NotFoundException(str, th2));
                return;
            default:
                Throwable th3 = (Throwable) obj;
                yx7.getClass();
                hm9.p("yx7", "searchChats: exception", th3);
                yx7.g.a(new MainSearchLoaderImpl$NotFoundException(str, th3));
                return;
        }
    }
}
