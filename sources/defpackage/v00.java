package defpackage;

import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: v00  reason: default package */
public final /* synthetic */ class v00 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ v00(int i) {
        this.a = i;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
            case 1:
                return ((oy5) obj2).s0 - ((oy5) obj).s0;
            case 2:
                return ((qy5) obj2).i - ((qy5) obj).i;
            case 3:
                lk0 lk0 = (lk0) obj;
                lk0 lk02 = (lk0) obj2;
                int compare = Integer.compare(lk0.c, lk02.c);
                return compare != 0 ? compare : lk0.b.compareTo(lk02.b);
            case 4:
                mk0 mk0 = (mk0) obj;
                mk0 mk02 = (mk0) obj2;
                int compare2 = Integer.compare(mk0.c, mk02.c);
                return compare2 != 0 ? compare2 : mk0.b.compareTo(mk02.b);
            case 5:
                int i = (((es1) obj).d.c > ((es1) obj2).d.c ? 1 : (((es1) obj).d.c == ((es1) obj2).d.c ? 0 : -1));
                if (i < 0) {
                    return 1;
                }
                return i == 0 ? 0 : -1;
            case 6:
                return Long.compare(((es8) obj2).k(), ((es8) obj).k());
            case 7:
                return Integer.compare(((o02) obj2).b, ((o02) obj).b);
            case 8:
                return Integer.compare(((p02) obj2).b, ((p02) obj).b);
            case 9:
                e52 e52 = (e52) obj;
                e52.getClass();
                return np8.j(((e52) obj2).o(), e52.o());
            case 10:
                e52 e522 = (e52) obj;
                e52 e523 = (e52) obj2;
                int j = np8.j(e523.b.a().e, e522.b.a().e);
                return j != 0 ? j : np8.j(e523.o(), e522.o());
            case 11:
                int i2 = (((cu8) obj).b > ((cu8) obj2).b ? 1 : (((cu8) obj).b == ((cu8) obj2).b ? 0 : -1));
                if (i2 < 0) {
                    return -1;
                }
                return i2 == 0 ? 0 : 1;
            case Protos.Attaches.Attach.PRESENT:
                long j2 = ((cu8) obj2).o;
                long j3 = ((cu8) obj).o;
                if (j2 < j3) {
                    return -1;
                }
                return j3 == j2 ? 0 : 1;
            case 13:
                vk6 vk6 = (vk6) obj;
                vk6 vk62 = (vk6) obj2;
                int f = xfg.f(Long.valueOf(vk62.k()), Long.valueOf(vk6.k()));
                return f != 0 ? f : xfg.f(Long.valueOf(vk6.getId()), Long.valueOf(vk62.getId()));
            case Protos.Attaches.Attach.LOCATION:
                return tpa.n(((Long) obj2).longValue(), ((Long) obj).longValue());
            case Protos.Attaches.Attach.DAILY_MEDIA:
                yq3 yq3 = (yq3) obj;
                yq3 yq32 = (yq3) obj2;
                return 0;
            case 16:
                return Long.compare(((d92) obj).a, ((d92) obj2).a);
            case LangUtils.HASH_SEED:
                return ((coc) obj2).f - ((coc) obj).f;
            case 18:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 19:
                Integer num3 = (Integer) obj;
                Integer num4 = (Integer) obj2;
                if (num3.intValue() == -1) {
                    return num4.intValue() == -1 ? 0 : -1;
                }
                if (num4.intValue() == -1) {
                    return 1;
                }
                return num3.intValue() - num4.intValue();
            case 20:
                Integer num5 = (Integer) obj;
                Integer num6 = (Integer) obj2;
                zma zma = bf4.f;
                return 0;
            case 21:
                return Integer.compare(((je4) ((List) obj).get(0)).Y, ((je4) ((List) obj2).get(0)).Y);
            case 22:
                List list = (List) obj;
                List list2 = (List) obj2;
                return y93.g(ze4.c((ze4) Collections.max(list, new v00(28)), (ze4) Collections.max(list2, new v00(28)))).a(list.size(), list2.size()).c((ze4) Collections.max(list, new ye4(0)), (ze4) Collections.max(list2, new ye4(0)), new ye4(0)).f();
            case 23:
                return ((ie4) Collections.max((List) obj)).compareTo((ie4) Collections.max((List) obj2));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return ((he4) Collections.max((List) obj)).compareTo((he4) Collections.max((List) obj2));
            case 25:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                return y93.g(af4.c((af4) Collections.max(list3, new v00(29)), (af4) Collections.max(list4, new v00(29)))).a(list3.size(), list4.size()).c((af4) Collections.max(list3, new ye4(1)), (af4) Collections.max(list4, new ye4(1)), new ye4(1)).f();
            case 26:
                return ((se4) ((List) obj).get(0)).compareTo((se4) ((List) obj2).get(0));
            case 27:
                return ((te4) ((List) obj).get(0)).compareTo((te4) ((List) obj2).get(0));
            case 28:
                return ze4.c((ze4) obj, (ze4) obj2);
            default:
                return af4.c((af4) obj, (af4) obj2);
        }
    }
}
