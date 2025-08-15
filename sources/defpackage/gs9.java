package defpackage;

import java.util.HashMap;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Protos;

/* renamed from: gs9  reason: default package */
public final class gs9 extends dle {
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gs9(sla sla, int i) {
        super(sla);
        this.o = i;
    }

    public short N() {
        switch (this.o) {
            case 1:
                yb9 yb9 = sla.c;
                return 80;
            case 2:
                yb9 yb92 = sla.c;
                return 1;
            case 3:
                yb9 yb93 = sla.c;
                return 16;
            case 4:
                yb9 yb94 = sla.c;
                return 60;
            case 5:
                yb9 yb95 = sla.c;
                return 43;
            case 8:
                yb9 yb96 = sla.c;
                return 97;
            case 9:
                yb9 yb97 = sla.c;
                return 96;
            case 10:
                yb9 yb98 = sla.c;
                return 193;
            case 11:
                yb9 yb99 = sla.c;
                return 81;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                yb9 yb910 = sla.c;
                return 119;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                yb9 yb911 = sla.c;
                return 79;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                yb9 yb912 = sla.c;
                return 83;
            case 16:
                yb9 yb913 = sla.c;
                return 82;
            default:
                return super.N();
        }
    }

    public int O() {
        switch (this.o) {
            case 2:
                return 0;
            default:
                return super.O();
        }
    }

    public boolean w() {
        switch (this.o) {
            case 2:
                return true;
            default:
                return super.w();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gs9(int i, int i2) {
        super((sla) null);
        this.o = 16;
        e(au1.s(i), "type");
        e(i2, NewHtcHomeBadger.COUNT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gs9(int i, long j, a20 a20, String str, String str2, String str3, String str4, String str5) {
        super((sla) null);
        this.o = 3;
        if (str != null) {
            p("firstName", str);
        }
        if (str2 != null) {
            p("lastName", str2);
        }
        if (str3 != null) {
            p("photoToken", str3);
        }
        if (j != 0) {
            i(j, "photoId");
        }
        if (a20 != null) {
            n("crop", a20.a());
        }
        if (!oag.t(str4)) {
            p("description", str4.equals("$REMOVE$") ? "" : str4);
        }
        if (!oag.t(str5)) {
            p("link", str5.equals("$REMOVE$") ? "" : str5);
        }
        p("avatarType", au1.e(i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gs9(long j) {
        super((sla) null);
        this.o = 5;
        if (j != 0) {
            i(j, "photoId");
            return;
        }
        throw new IllegalArgumentException("photoId must not be 0");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gs9(Boolean bool) {
        super((sla) null);
        this.o = 1;
        e(1, NewHtcHomeBadger.COUNT);
        ((HashMap) this.b).put("profile", bool);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gs9(String str, long j, long j2, long j3) {
        super((sla) null);
        this.o = 15;
        i(j, "videoId");
        if (j2 != 0) {
            i(j2, ApiProtocol.PARAM_CHAT_ID);
        }
        if (j3 > 0) {
            i(j3, "messageId");
        }
        if (!oag.t(str)) {
            p(ApiProtocol.KEY_TOKEN, str);
        }
    }
}
