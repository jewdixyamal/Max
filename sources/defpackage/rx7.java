package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/* renamed from: rx7  reason: default package */
public final /* synthetic */ class rx7 implements qj3, b66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx7 b;

    public /* synthetic */ rx7(yx7 yx7, int i) {
        this.a = i;
        this.b = yx7;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                yx7 yx7 = this.b;
                yx7.getClass();
                yx7.o = ((xx7) obj).b;
                return;
            default:
                Throwable th = (Throwable) obj;
                yx7 yx72 = this.b;
                yx72.getClass();
                hm9.p("yx7", "searchMessages: exception", th);
                yx72.g.a(th);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r13v6, types: [gle, upb, java.lang.Object] */
    public Object apply(Object obj) {
        switch (this.a) {
            case 2:
                yx7 yx7 = this.b;
                upb upb = (upb) obj;
                yx7.getClass();
                List list = upb.c;
                List list2 = yx7.o;
                aq9 aq9 = b0d.b;
                list.removeAll((List) list.stream().filter(new zzc(list2, (List) list2.stream().filter(new fl3(3)).map(new gl3(6)).collect(Collectors.toList()), (List) list2.stream().filter(new fl3(4)).map(new gl3(7)).collect(Collectors.toList()), 1)).collect(Collectors.toList()));
                int i = upb.o;
                Long l = upb.X;
                ? gle = new gle();
                gle.c = list;
                gle.o = i;
                gle.X = l;
                return gle;
            default:
                sq2 sq2 = (sq2) obj;
                yx7 yx72 = this.b;
                yx72.getClass();
                List<nx8> list3 = sq2.c;
                ArrayList arrayList = new ArrayList(list3.size());
                for (nx8 nx8 : list3) {
                    try {
                        fs8 fs8 = nx8.b;
                        List list4 = nx8.o;
                        arrayList.add(new kzc(3, nx8.c, (ArrayList) list4, (e52) null, (uj3) null, fs8, nx8.a, (vpb) null));
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
                String str = sq2.X;
                if (str == null || !str.equals("0")) {
                    yx72.s = sq2.X;
                } else {
                    yx72.s = null;
                }
                return arrayList;
        }
    }
}
