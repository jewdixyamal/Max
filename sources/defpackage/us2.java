package defpackage;

import android.view.View;
import java.util.BitSet;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: us2  reason: default package */
public final class us2 extends hqd {
    public static l62 G(ml2 ml2) {
        int ordinal = ml2.ordinal();
        if (ordinal == 0) {
            return l62.a;
        }
        if (ordinal == 1) {
            return l62.b;
        }
        if (ordinal == 2) {
            return l62.c;
        }
        if (ordinal == 3) {
            return l62.o;
        }
        if (ordinal == 4) {
            return l62.X;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: E */
    public final void A(nl2 nl2) {
        m62 m62 = (m62) this.a;
        int id = m62.getId();
        m62.setId(Long.hashCode(nl2.a));
        m62.setTitle(nl2.c);
        boolean z = false;
        CharSequence charSequence = nl2.Y;
        if (!(!(charSequence == null || w9e.C0(charSequence)))) {
            charSequence = null;
        }
        if (charSequence == null) {
            charSequence = nl2.X;
        }
        m62.setSubtitle(charSequence);
        m62.setTyping(nl2.Z);
        m62.setPinned(nl2.B0 != 0);
        m62.setMuted(nl2.y0);
        m62.setOnline(nl2.t0);
        m62.setCallBadge(nl2.G0);
        m62.setVerified(nl2.u0);
        m62.setMention(nl2.A0);
        m62.setReaction(nl2.z0);
        m62.setTime(nl2.s0);
        if (id == m62.getId()) {
            z = true;
        }
        m62.e(nl2.x0, z);
        m62.setStatus(G(nl2.w0));
        m62.c(nl2.b, nl2.E0, Long.valueOf(nl2.D0));
    }

    /* renamed from: F */
    public final void B(nl2 nl2, Object obj) {
        CharSequence charSequence = null;
        ll2 ll2 = obj instanceof ll2 ? (ll2) obj : null;
        if (ll2 != null) {
            BitSet bitSet = (BitSet) ll2.b;
            boolean z = true;
            boolean z2 = bitSet.get(1);
            View view = this.a;
            if (z2) {
                ((m62) view).c(nl2.b, nl2.E0, Long.valueOf(nl2.D0));
            }
            if (bitSet.get(0)) {
                ((m62) view).setOnline(nl2.t0);
            }
            if (bitSet.get(2)) {
                ((m62) view).setTitle(nl2.c);
            }
            if (bitSet.get(4)) {
                m62 m62 = (m62) view;
                CharSequence charSequence2 = nl2.Y;
                if (!(charSequence2 == null || w9e.C0(charSequence2))) {
                    charSequence = charSequence2;
                }
                if (charSequence == null) {
                    charSequence = nl2.X;
                }
                m62.setSubtitle(charSequence);
            }
            if (bitSet.get(5)) {
                ((m62) view).setTyping(nl2.Z);
            }
            if (bitSet.get(6)) {
                ((m62) view).setTime(nl2.s0);
            }
            if (bitSet.get(8)) {
                ((m62) view).setStatus(G(nl2.w0));
            }
            if (bitSet.get(9)) {
                ((m62) view).e(nl2.x0, true);
            }
            if (bitSet.get(10)) {
                ((m62) view).setMuted(nl2.y0);
            }
            if (bitSet.get(11)) {
                ((m62) view).setReaction(nl2.z0);
            }
            if (bitSet.get(12)) {
                ((m62) view).setMention(nl2.A0);
            }
            if (bitSet.get(13)) {
                m62 m622 = (m62) view;
                if (nl2.B0 == 0) {
                    z = false;
                }
                m622.setPinned(z);
            }
            if (bitSet.get(14)) {
                ((m62) view).setCallBadge(nl2.G0);
                return;
            }
            return;
        }
        A(nl2);
    }
}
