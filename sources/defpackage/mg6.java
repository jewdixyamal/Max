package defpackage;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* renamed from: mg6  reason: default package */
public final class mg6 extends mof {
    public final /* synthetic */ int a;
    public final WeakReference b;
    public int c;
    public int d;

    public mg6(rg6 rg6) {
        this.a = 0;
        this.b = new WeakReference(rg6);
        this.c = 0;
        this.d = 0;
    }

    public final void a(int i) {
        switch (this.a) {
            case 0:
                this.c = this.d;
                this.d = i;
                return;
            case 1:
                this.c = this.d;
                this.d = i;
                TabLayout tabLayout = (TabLayout) this.b.get();
                if (tabLayout != null) {
                    tabLayout.i1 = this.d;
                    return;
                }
                return;
            default:
                this.c = this.d;
                this.d = i;
                TabLayout tabLayout2 = (TabLayout) this.b.get();
                if (tabLayout2 != null) {
                    tabLayout2.i1 = this.d;
                    return;
                }
                return;
        }
    }

    public final void b(int i, float f, int i2) {
        switch (this.a) {
            case 0:
                rg6 rg6 = (rg6) this.b.get();
                if (rg6 != null) {
                    try {
                        rg6.a(rg6.c.a, i);
                        rg6.c(i, f);
                        return;
                    } catch (IllegalArgumentException e) {
                        String name = mg6.class.getName();
                        String message = e.getMessage();
                        hm9.l0(name, "updatePagesNumber error: " + message, e);
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                TabLayout tabLayout = (TabLayout) this.b.get();
                if (tabLayout != null) {
                    int i3 = this.d;
                    tabLayout.q(i, f, i3 != 2 || this.c == 1, (i3 == 2 && this.c == 0) ? false : true, false);
                    return;
                }
                return;
            default:
                TabLayout tabLayout2 = (TabLayout) this.b.get();
                if (tabLayout2 != null) {
                    int i4 = this.d;
                    tabLayout2.q(i, f, i4 != 2 || this.c == 1, (i4 == 2 && this.c == 0) ? false : true, false);
                    return;
                }
                return;
        }
    }

    public final void c(int i) {
        switch (this.a) {
            case 0:
                rg6 rg6 = (rg6) this.b.get();
                try {
                    int i2 = this.d;
                    if (i2 != 0) {
                        if (i2 != 2 || this.c != 0) {
                            return;
                        }
                    }
                    if (rg6 != null) {
                        rg6.setSelectedPageIndex(i);
                        return;
                    }
                    return;
                } catch (IllegalArgumentException e) {
                    String name = mg6.class.getName();
                    String message = e.getMessage();
                    hm9.l0(name, "updatePagesNumber error: " + message, e);
                    return;
                }
            case 1:
                TabLayout tabLayout = (TabLayout) this.b.get();
                if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                    int i3 = this.d;
                    tabLayout.o(tabLayout.h(i), i3 == 0 || (i3 == 2 && this.c == 0));
                    return;
                }
                return;
            default:
                TabLayout tabLayout2 = (TabLayout) this.b.get();
                if (tabLayout2 != null && tabLayout2.getSelectedTabPosition() != i && i < tabLayout2.getTabCount()) {
                    int i4 = this.d;
                    tabLayout2.o(tabLayout2.h(i), i4 == 0 || (i4 == 2 && this.c == 0));
                    return;
                }
                return;
        }
    }

    public mg6(TabLayout tabLayout, int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = new WeakReference(tabLayout);
                this.d = 0;
                this.c = 0;
                return;
            default:
                this.b = new WeakReference(tabLayout);
                this.d = 0;
                this.c = 0;
                return;
        }
    }
}
