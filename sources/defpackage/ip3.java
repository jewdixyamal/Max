package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.Collections;
import java.util.List;
import ru.ok.messages.views.widgets.TamAvatarView;

/* renamed from: ip3  reason: default package */
public final class ip3 extends hdc {
    public List X = Collections.emptyList();
    public long Y;
    public gp3 Z;
    public final el3 o;

    public ip3(el3 el3) {
        this.o = el3;
    }

    public final int j() {
        return this.X.size();
    }

    public final long k(int i) {
        return ((e08) this.X.get(i)).c;
    }

    public final void r(dec dec, int i) {
        hp3 hp3 = (hp3) dec;
        e08 e08 = (e08) this.X.get(i);
        boolean z = e08.h;
        ImageView imageView = hp3.F0;
        TamAvatarView tamAvatarView = hp3.G0;
        ip3 ip3 = hp3.J0;
        long j = e08.b;
        if (z) {
            imageView.setVisibility(4);
            tamAvatarView.setVisibility(0);
            tamAvatarView.a(ip3.o.i(j, false), false);
            if (e08.k) {
                tamAvatarView.setAlpha(1.0f);
            } else {
                tamAvatarView.setAlpha(0.5f);
            }
        } else {
            imageView.setVisibility(0);
            tamAvatarView.setVisibility(8);
            tamAvatarView.a(ip3.o.i(j, false), false);
        }
        int i2 = (e08.c > ip3.Y ? 1 : (e08.c == ip3.Y ? 0 : -1));
        View view = hp3.H0;
        if (i2 == 0) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
        hp3.I0 = e08;
    }

    public final dec t(ViewGroup viewGroup, int i) {
        return new hp3(this, LayoutInflater.from(viewGroup.getContext()).inflate(yyb.row_contact_location, viewGroup, false));
    }
}
