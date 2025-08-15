package defpackage;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.keyboardmedia.emoji.KeyboardEmojiWidget;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.profile.screens.media.ChatMediaListWidget;

/* renamed from: qg2  reason: default package */
public final class qg2 extends p04 {
    public static final yb9 B0 = new Object();
    public final Object A0;
    public final /* synthetic */ int w0 = 0;
    public final long x0;
    public List y0;
    public final Object z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qg2(uu3 uu3, long j) {
        super(uu3, 1);
        yb9 yb9 = B0;
        this.z0 = uu3;
        this.x0 = j;
        this.A0 = yb9;
        this.y0 = x53.D0(ih2.o);
    }

    public final void E(znc znc, int i) {
        KeyboardEmojiWidget keyboardEmojiWidget;
        switch (this.w0) {
            case 0:
                if (!znc.n()) {
                    ((yb9) this.A0).getClass();
                    ChatMediaListWidget chatMediaListWidget = new ChatMediaListWidget(this.x0, (ih2) this.y0.get(i));
                    chatMediaListWidget.setTargetController((uu3) this.z0);
                    chatMediaListWidget.setRetainViewMode(tu3.b);
                    znc.R(new coc(chatMediaListWidget, (String) null, (zu3) null, (zu3) null, false, -1));
                    return;
                }
                return;
            default:
                if (!znc.n() && i >= 0 && i <= y53.L(this.y0)) {
                    int i2 = tc7.$EnumSwitchMapping$0[((bd7) this.y0.get(i)).ordinal()];
                    tu3 tu3 = tu3.b;
                    String str = (String) this.A0;
                    if (i2 == 1) {
                        KeyboardStickersWidget keyboardStickersWidget = new KeyboardStickersWidget(this.x0, str, (z84) null);
                        keyboardStickersWidget.c = (gw7) this.z0;
                        keyboardStickersWidget.setRetainViewMode(tu3);
                        keyboardEmojiWidget = keyboardStickersWidget;
                    } else if (i2 == 2) {
                        KeyboardEmojiWidget keyboardEmojiWidget2 = new KeyboardEmojiWidget(str, (z84) null);
                        keyboardEmojiWidget2.setRetainViewMode(tu3);
                        keyboardEmojiWidget = keyboardEmojiWidget2;
                    } else if (i2 == 3) {
                        keyboardEmojiWidget = null;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (keyboardEmojiWidget != null) {
                        znc.R(new coc(keyboardEmojiWidget, (String) null, (zu3) null, (zu3) null, false, -1));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final int j() {
        switch (this.w0) {
            case 0:
                return this.y0.size();
            default:
                return this.y0.size();
        }
    }

    public final long k(int i) {
        switch (this.w0) {
            case 0:
                return (long) ((ih2) this.y0.get(i)).ordinal();
            default:
                return (long) ((bd7) this.y0.get(i)).c;
        }
    }

    public qg2(uu3 uu3, gw7 gw7, long j, String str) {
        super(uu3, 1);
        this.z0 = gw7;
        this.x0 = j;
        this.A0 = str;
        this.y0 = nz4.a;
    }
}
