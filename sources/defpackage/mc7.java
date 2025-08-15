package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.keyboardmedia.emoji.KeyboardEmojiWidget;

/* renamed from: mc7  reason: default package */
public final class mc7 extends kg6 {
    public final /* synthetic */ int c = 1;
    public final Object d;
    public final Object e;

    public mc7(GridLayoutManager gridLayoutManager, hdc hdc) {
        this.d = gridLayoutManager;
        this.e = hdc;
    }

    public final int c(int i) {
        GridLayoutManager q;
        int l;
        switch (this.c) {
            case 0:
                KeyboardEmojiWidget keyboardEmojiWidget = (KeyboardEmojiWidget) this.d;
                if (i >= keyboardEmojiWidget.X.j() || keyboardEmojiWidget.X.l(i) != jca.q || (q = z7.q((RecyclerView) this.e)) == null) {
                    return 1;
                }
                return q.F;
            default:
                hdc hdc = (hdc) this.e;
                if (i >= hdc.j() || ((l = hdc.l(i)) != tga.k && l != tga.l && l != jca.r)) {
                    return 1;
                }
                return ((GridLayoutManager) this.d).F;
        }
    }

    public mc7(KeyboardEmojiWidget keyboardEmojiWidget, RecyclerView recyclerView) {
        this.d = keyboardEmojiWidget;
        this.e = recyclerView;
    }
}
