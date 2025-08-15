package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Protos;

/* renamed from: au  reason: default package */
public final class au extends dle {
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ au(sla sla, int i) {
        super(sla);
        this.o = i;
    }

    public short N() {
        switch (this.o) {
            case 0:
                yb9 yb9 = sla.c;
                return 29;
            case 1:
                yb9 yb92 = sla.c;
                return 28;
            case 2:
                yb9 yb93 = sla.c;
                return 26;
            case 3:
                yb9 yb94 = sla.c;
                return 261;
            case 4:
                yb9 yb95 = sla.c;
                return 260;
            case 5:
                yb9 yb96 = sla.c;
                return 259;
            case 6:
                yb9 yb97 = sla.c;
                return 27;
            case 10:
                yb9 yb98 = sla.c;
                return 76;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return sla.CHAT_BOT_COMMANDS.a;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                yb9 yb99 = sla.c;
                return 54;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                yb9 yb910 = sla.c;
                return 61;
            case 16:
                yb9 yb911 = sla.c;
                return 117;
            case LangUtils.HASH_SEED /*17*/:
                yb9 yb912 = sla.c;
                return 63;
            case 18:
                yb9 yb913 = sla.c;
                return 52;
            case 19:
                return sla.CHAT_HIDE.a;
            case 21:
                yb9 yb914 = sla.c;
                return 48;
            case 22:
                yb9 yb915 = sla.c;
                return 57;
            case 23:
                yb9 yb916 = sla.c;
                return 58;
            case 26:
                yb9 yb917 = sla.c;
                return 59;
            case 27:
                yb9 yb918 = sla.c;
                return 77;
            case 28:
                yb9 yb919 = sla.c;
                return 86;
            case 29:
                yb9 yb920 = sla.c;
                return 68;
            default:
                return super.N();
        }
    }

    public boolean V() {
        switch (this.o) {
            case 7:
                return false;
            case 8:
                return false;
            case 11:
                return true;
            default:
                return super.V();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public au(int i, long j) {
        super((sla) null);
        this.o = 6;
        if (i != 0) {
            p("type", au1.d(i));
        }
        i(j, "sync");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public au(int i, String str, long j, int i2, String str2) {
        super((sla) null);
        this.o = 2;
        if (i != 0 || !oag.t(str)) {
            if (i != 0) {
                p("type", au1.d(i));
            }
            if (!oag.t(str)) {
                p("sectionId", str);
            }
            i(j, "from");
            e(i2, NewHtcHomeBadger.COUNT);
            if (str2 != null) {
                p("query", str2);
                return;
            }
            return;
        }
        throw new RuntimeException("Asset type or sectionId should be set");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public au(int i, long[] jArr) {
        super((sla) null);
        this.o = 1;
        if (i == 0) {
            throw new IllegalArgumentException("type must not be null");
        } else if (jArr == null || jArr.length == 0) {
            throw new IllegalArgumentException("ids must not be null or empty");
        } else {
            p("type", au1.d(i));
            h("ids", jArr);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public au(long j, int i, List list, ek2 ek2, boolean z, int i2, int i3) {
        super((sla) null);
        this.o = 27;
        i(j, ApiProtocol.PARAM_CHAT_ID);
        p("operation", wg0.c(i));
        g("userIds", list);
        p("type", ek2.a);
        if (i == 1) {
            d("showHistory", z);
        }
        if (i2 != 0) {
            e(i2, "cleanMsgPeriod");
        }
        if (i3 != 0) {
            e(i3, "permissions");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public au(long j, String str, long j2, int i, String str2) {
        super((sla) null);
        this.o = 26;
        i(j, ApiProtocol.PARAM_CHAT_ID);
        if (!oag.t(str)) {
            p("type", str);
        }
        if (j2 != 0) {
            i(j2, "marker");
        }
        if (i > 0) {
            e(i, NewHtcHomeBadger.COUNT);
        }
        if (!oag.t(str2)) {
            p("query", str2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public au(String str) {
        super((sla) null);
        this.o = 22;
        if (!oag.t(str)) {
            p("link", str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public au(String str, String str2) {
        super((sla) null);
        this.o = 29;
        p("query", str);
        e(50, NewHtcHomeBadger.COUNT);
        if (!oag.t(str2)) {
            p("marker", str2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public au(long j, Long l, Set set, Integer num, Integer num2) {
        super(sla.CHAT_MEDIA);
        this.o = 25;
        i(j, ApiProtocol.PARAM_CHAT_ID);
        ((HashMap) this.b).put("messageId", l);
        if (set != null && !set.isEmpty()) {
            b10 b10 = b10.UNKNOWN;
            ArrayList arrayList = new ArrayList();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                switch (((b10) it.next()).ordinal()) {
                    case 2:
                        arrayList.add("PHOTO");
                        break;
                    case 3:
                        arrayList.add("VIDEO");
                        break;
                    case 4:
                        arrayList.add("AUDIO");
                        break;
                    case 6:
                        arrayList.add("SHARE");
                        break;
                    case 7:
                        arrayList.add("APP");
                        break;
                    case 8:
                        arrayList.add("CALL");
                        break;
                    case 9:
                        arrayList.add("FILE");
                        break;
                    case 10:
                        arrayList.add("CONTACT");
                        break;
                    case 11:
                        arrayList.add("PRESENT");
                        break;
                    case Protos.Attaches.Attach.PRESENT /*12*/:
                        arrayList.add("INLINE_KEYBOARD");
                        break;
                    case 13:
                        arrayList.add("LOCATION");
                        break;
                    case Protos.Attaches.Attach.LOCATION /*14*/:
                        arrayList.add("REPLY_KEYBOARD");
                        break;
                }
            }
            g("attachTypes", arrayList);
        }
        ((HashMap) this.b).put("forward", num);
        ((HashMap) this.b).put("backward", num2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public au(long j, long j2, int i, long j3, int i2, long j4, boolean z, boolean z2, String str, mg4 mg4) {
        super(sla.CHAT_HISTORY);
        this.o = 20;
        i(j, ApiProtocol.PARAM_CHAT_ID);
        i(j2, "from");
        e(i, "forward");
        i(j3, "forwardTime");
        e(i2, "backward");
        i(j4, "backwardTime");
        d("getChat", z);
        d("getMessages", z2);
        if (!(str == null || str.length() == 0)) {
            p("chatAccessToken", str);
        }
        p("itemType", mg4.name());
    }
}
