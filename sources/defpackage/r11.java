package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* renamed from: r11  reason: default package */
public final class r11 extends FrameLayout {
    public final je7 a = tu0.r(3, new k11(2));
    public final je7 b;
    public final je7 c;

    public r11(Context context) {
        super(context, (AttributeSet) null);
        this.b = tu0.r(3, new q11(context, this, 0));
        this.c = tu0.r(3, new q11(context, this, 1));
    }

    private final p11 getNewCallBottomPanel() {
        return (p11) this.b.getValue();
    }

    private final j11 getOldCallBottomPanel() {
        return (j11) this.c.getValue();
    }

    public final void a() {
        if (d()) {
            p11 newCallBottomPanel = getNewCallBottomPanel();
            ywe ywe = newCallBottomPanel.U0;
            if (ywe != null) {
                ywe.dismiss();
            }
            ywe ywe2 = newCallBottomPanel.V0;
            if (ywe2 != null) {
                ywe2.dismiss();
            }
            newCallBottomPanel.U0 = null;
            newCallBottomPanel.V0 = null;
            return;
        }
        getOldCallBottomPanel().y();
    }

    public final void b() {
        if (d()) {
            ywe ywe = getNewCallBottomPanel().U0;
            if (ywe != null) {
                ywe.a();
                return;
            }
            return;
        }
        ywe ywe2 = getOldCallBottomPanel().Q0;
        if (ywe2 != null) {
            ywe2.a();
        }
    }

    public final void c() {
        ywe ywe;
        if (d() && (ywe = getNewCallBottomPanel().V0) != null) {
            ywe.a();
        }
    }

    public final boolean d() {
        return ((Boolean) this.a.getValue()).booleanValue();
    }

    public final void e(ArrayList arrayList) {
        if (!d()) {
            getOldCallBottomPanel().B(arrayList);
        }
    }

    public final void f() {
        if (d()) {
            p11 newCallBottomPanel = getNewCallBottomPanel();
            ywe ywe = newCallBottomPanel.U0;
            eqe eqe = new eqe(b8a.W1);
            int i = x7a.X;
            p11 p11 = newCallBottomPanel;
            newCallBottomPanel.U0 = p11.y(ywe, newCallBottomPanel.K0, eqe, new l11(newCallBottomPanel, 3), Integer.valueOf(i));
            return;
        }
        getOldCallBottomPanel().C();
    }

    public final void g(kl7 kl7) {
        if (!d()) {
            getOldCallBottomPanel().E(kl7);
        }
    }

    public final void h() {
        if (d()) {
            p11 newCallBottomPanel = getNewCallBottomPanel();
            p11 p11 = newCallBottomPanel;
            newCallBottomPanel.V0 = p11.y(newCallBottomPanel.V0, newCallBottomPanel.N0, new eqe(b8a.X1), new l11(newCallBottomPanel, 0), (Integer) null);
        }
    }

    public final void setAudioInfo(a51 a51) {
        if (d()) {
            getNewCallBottomPanel().setAudioInfo(a51);
        } else {
            getOldCallBottomPanel().setAudioInfo(a51);
        }
    }

    public final void setChatUnreadMessageCount(int i) {
        if (d()) {
            getNewCallBottomPanel().setChatUnreadMessageCount(i);
        }
    }

    public final void setClickListener(o11 o11) {
        if (d()) {
            getNewCallBottomPanel().setClickListener(o11);
        } else {
            getOldCallBottomPanel().setClickListener(o11);
        }
    }

    public final void setMicrophoneEnabled(m38 m38) {
        if (d()) {
            getNewCallBottomPanel().setMicrophoneEnabled(m38);
        } else {
            getOldCallBottomPanel().setMicrophoneEnabled(m38);
        }
    }

    public final void setOpenChat(m38 m38) {
        if (d()) {
            getNewCallBottomPanel().setOpenChat(m38);
        }
    }

    public final void setRaiseHand(m38 m38) {
        if (d()) {
            getNewCallBottomPanel().setRaiseHand(m38);
        }
    }

    public final void setVideoEnabled(m38 m38) {
        if (d()) {
            getNewCallBottomPanel().setVideoEnabled(m38);
        } else {
            getOldCallBottomPanel().setVideoEnabled(m38);
        }
    }

    public final void setVolumeMicrophone(float f) {
        if (d()) {
            getNewCallBottomPanel().setVolumeMicrophone(f);
        }
    }
}
