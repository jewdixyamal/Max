package ru.ok.android.externcalls.sdk.layout;

public final class ConversationDisplayLayoutItem {
    private final bff layout;
    private final ConversationVideoTrackParticipantKey videoTrackParticipantKey;

    public ConversationDisplayLayoutItem(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, bff bff) {
        this.videoTrackParticipantKey = conversationVideoTrackParticipantKey;
        this.layout = bff;
    }

    public bff getLayout() {
        return this.layout;
    }

    public ConversationVideoTrackParticipantKey getVideoTrackParticipantKey() {
        return this.videoTrackParticipantKey;
    }
}
