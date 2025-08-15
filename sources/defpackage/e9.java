package defpackage;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.members.list.MembersListWidget;
import one.me.profile.screens.addadmins.fromcontacts.AdminsFromContactsScreen;

/* renamed from: e9  reason: default package */
public final class e9 extends p04 {
    public final long w0;
    public final String x0;
    public final List y0;

    public e9(long j, String str, List list, uu3 uu3) {
        super(uu3, 1);
        this.w0 = j;
        this.x0 = str;
        this.y0 = list;
    }

    public final void E(znc znc, int i) {
        uu3 membersListWidget;
        if (!znc.n()) {
            int s = au1.s(((g9) this.y0.get(i)).c);
            String str = this.x0;
            if (s == 0) {
                membersListWidget = new MembersListWidget(str, new go8(this.w0, ek2.MEMBER, (Integer) null, 12), (z84) null);
            } else if (s == 1) {
                membersListWidget = new AdminsFromContactsScreen(str, this.w0, (z84) null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            uu3 uu3 = membersListWidget;
            uu3.setRetainViewMode(tu3.b);
            znc.R(new coc(uu3, (String) null, (zu3) null, (zu3) null, false, -1));
        }
    }

    public final int j() {
        return this.y0.size();
    }
}
