package defpackage;

import java.util.List;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;

/* renamed from: mqa  reason: default package */
public abstract class mqa {
    public static final hg1 a() {
        gg1 gg1 = gg1.c;
        gg1 gg12 = gg1;
        ParticipantId d = d(gg1);
        rd8 rd8 = rd8.a;
        nz4 nz4 = nz4.a;
        llf llf = r5;
        llf llf2 = new llf(false, new ConversationVideoTrackParticipantKey.Builder().setParticipantId(d).build(), false);
        llf llf3 = r5;
        llf llf4 = new llf(false, new ConversationVideoTrackParticipantKey.Builder().setParticipantId(d).setType(olf.b).build(), false);
        return new hg1(gg12, rd8, rd8, rd8, false, false, llf, llf3, false, false, false, false, false, 0, true, false, false, false, false, false, nz4, 1);
    }

    public static final gg1 b(ParticipantId participantId) {
        Integer e0;
        int i = 0;
        List Q0 = w9e.Q0(participantId.id, new String[]{":"}, false, 6);
        if (Q0.size() > 1 && (e0 = dae.e0((String) Q0.get(1))) != null) {
            i = e0.intValue();
        }
        return new gg1(Long.parseLong((String) x53.g0(Q0)), i);
    }

    public static final ParticipantId c(long j) {
        return ParticipantId.authorized(String.valueOf(j));
    }

    public static final ParticipantId d(gg1 gg1) {
        return new ParticipantId(String.valueOf(gg1.a), false, gg1.b);
    }
}
