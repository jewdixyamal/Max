package ru.ok.android.externcalls.sdk.participant;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.add.AddParticipantsResult;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrod;", "signaling", "Le5f;", "invoke", "(Lrod;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class AddParticipantsCommands$addParticipants$1 extends rd7 implements m56 {
    final /* synthetic */ boolean $isShowChatHistory;
    final /* synthetic */ Boolean $isUnban;
    final /* synthetic */ m56 $onError;
    final /* synthetic */ m56 $onSuccess;
    final /* synthetic */ Collection<bg1> $participantsIds;
    final /* synthetic */ AddParticipantsCommands this$0;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(7:0|1|2|3|4|5|7) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000c */
        static {
            /*
                r0 = 2
                int[] r1 = defpackage.au1.v(r0)
                int r1 = r1.length
                int[] r1 = new int[r1]
                r2 = 0
                r3 = 1
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x000c }
            L_0x000c:
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x000e }
            L_0x000e:
                $EnumSwitchMapping$0 = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.participant.AddParticipantsCommands$addParticipants$1.WhenMappings.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddParticipantsCommands$addParticipants$1(Collection<bg1> collection, Boolean bool, boolean z, m56 m56, AddParticipantsCommands addParticipantsCommands, m56 m562) {
        super(1);
        this.$participantsIds = collection;
        this.$isUnban = bool;
        this.$isShowChatHistory = z;
        this.$onError = m56;
        this.this$0 = addParticipantsCommands;
        this.$onSuccess = m562;
    }

    /* access modifiers changed from: private */
    public static final void invoke$lambda$4(AddParticipantsCommands addParticipantsCommands, m56 m56, m56 m562, JSONObject jSONObject) {
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (jSONObject.has("participants")) {
                JSONArray jSONArray = jSONObject.getJSONArray("participants");
                int length = jSONObject.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        bg1 F = f46.F(optJSONObject);
                        int s = au1.s(addParticipantsCommands.call.y(F, optJSONObject));
                        if (s == 0) {
                            arrayList.add(F);
                        } else if (s == 1) {
                            arrayList2.add(F);
                        }
                    }
                }
            }
            if (m56 != null) {
                List<bg1> N = f46.N(jSONObject, "rejectedParticipantIds");
                List<bg1> list = nz4.a;
                if (N == null) {
                    N = list;
                }
                List N2 = f46.N(jSONObject, "bannedParticipantIds");
                if (N2 != null) {
                    list = N2;
                }
                IdMappingWrapper access$getMappings$p = addParticipantsCommands.mappings;
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ParticipantId byInternal = access$getMappings$p.getByInternal((bg1) it.next());
                    if (byInternal != null) {
                        arrayList3.add(byInternal);
                    }
                }
                IdMappingWrapper access$getMappings$p2 = addParticipantsCommands.mappings;
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ParticipantId byInternal2 = access$getMappings$p2.getByInternal((bg1) it2.next());
                    if (byInternal2 != null) {
                        arrayList4.add(byInternal2);
                    }
                }
                IdMappingWrapper access$getMappings$p3 = addParticipantsCommands.mappings;
                ArrayList arrayList5 = new ArrayList();
                for (bg1 byInternal3 : N) {
                    ParticipantId byInternal4 = access$getMappings$p3.getByInternal(byInternal3);
                    if (byInternal4 != null) {
                        arrayList5.add(byInternal4);
                    }
                }
                IdMappingWrapper access$getMappings$p4 = addParticipantsCommands.mappings;
                ArrayList arrayList6 = new ArrayList();
                for (bg1 byInternal5 : list) {
                    ParticipantId byInternal6 = access$getMappings$p4.getByInternal(byInternal5);
                    if (byInternal6 != null) {
                        arrayList6.add(byInternal6);
                    }
                }
                m56.invoke(new AddParticipantsResult(arrayList3, arrayList4, arrayList5, arrayList6));
            }
        } catch (JSONException e) {
            if (m562 != null) {
                m562.invoke(new RuntimeException("add.participant.success", e));
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void invoke$lambda$5(m56 m56, AddParticipantsCommands addParticipantsCommands, JSONObject jSONObject) {
        if (m56 != null) {
            m56.invoke(addParticipantsCommands.parseAddError(jSONObject));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((rod) obj);
        return e5f.a;
    }

    public final void invoke(rod rod) {
        try {
            ka6 f = f46.f(this.$participantsIds, this.$isUnban, this.$isShowChatHistory);
            AddParticipantsCommands addParticipantsCommands = this.this$0;
            m56 m56 = this.$onSuccess;
            m56 m562 = this.$onError;
            rod.d(f, false, new c(addParticipantsCommands, m56, m562), new b(m562, addParticipantsCommands, 1));
        } catch (JSONException e) {
            m56 m563 = this.$onError;
            if (m563 != null) {
                m563.invoke(new RuntimeException("add.participant", e));
            }
        }
    }
}
