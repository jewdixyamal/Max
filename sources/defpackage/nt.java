package defpackage;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.asr.internal.commands.AsrCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.chat.internal.command.ChatCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.feature.internal.commands.ConversationFeatureCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.feedback.internal.commands.FeedbackCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.commands.UrlSharingCommandsExecutorImpl;

/* renamed from: nt  reason: default package */
public final /* synthetic */ class nt implements qod {
    public final /* synthetic */ int a;
    public final /* synthetic */ m56 b;

    public /* synthetic */ nt(int i, m56 m56) {
        this.a = i;
        this.b = m56;
    }

    public final void j(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                AsrCommandsExecutorImpl.startRecord$lambda$1(this.b, jSONObject);
                return;
            case 1:
                AsrCommandsExecutorImpl.stopRecord$lambda$3(this.b, jSONObject);
                return;
            case 2:
                ChatCommandExecutorImpl.sendMessage$lambda$3(this.b, jSONObject);
                return;
            case 3:
                ConversationFeatureCommandExecutorImpl.enableFeatureForRoles$lambda$1(this.b, jSONObject);
                return;
            case 4:
                FeedbackCommandsExecutorImpl.sendFeedback$lambda$1(this.b, jSONObject);
                return;
            case 5:
                this.b.invoke(new RuntimeException("get-participant-list-chunk error " + jSONObject));
                return;
            case 6:
                this.b.invoke(new RuntimeException("get-rooms error " + jSONObject));
                return;
            case 7:
                MediaMuteCommandExecutorImpl.requestToEnableMedia$lambda$3(this.b, jSONObject);
                return;
            case 8:
                MediaMuteCommandExecutorImpl.updateMediaOptions$lambda$1(this.b, jSONObject);
                return;
            case 9:
                ParticipantStatesManagerImpl.lowerHandForAll$lambda$14(this.b, jSONObject);
                return;
            case 10:
                UrlSharingCommandsExecutorImpl.start$lambda$1(this.b, jSONObject);
                return;
            default:
                UrlSharingCommandsExecutorImpl.stop$lambda$3(this.b, jSONObject);
                return;
        }
    }

    public /* synthetic */ nt(Object obj, p66 p66, int i) {
        this.a = i;
        this.b = (m56) p66;
    }
}
