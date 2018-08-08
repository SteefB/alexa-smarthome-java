package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.Context;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;

import java.util.Optional;

public class ResumeScheduleConfirmation implements Response {
    private Context context;
    
    @Override
    public MessageName getMessageName() {
        return MessageName.RESUME_SCHEDULE_CONFIRMATION;
    }
    
    @Override
    public boolean responseSupportsContextPayload() {
        return true;
    }
    
    @Override
    public Optional<Context> getResponseContext() {
        return Optional.ofNullable(context);
    }
    
    public Context getContext(Context context) {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
