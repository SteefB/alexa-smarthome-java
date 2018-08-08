package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.Endpoint;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;
import uk.co.gdickinson.smarthome.lambda.models.Temperature;

import java.util.Optional;

public class ResumeScheduleRequest extends Request<ResumeScheduleConfirmation> {
  private Endpoint endpoint;

  @Override
  public MessageName getMessageName() {
    return MessageName.RESUME_SCHEDULE_REQUEST;
  }

  public Optional<Endpoint> getEndpoint() {
      return Optional.ofNullable(endpoint);
  }

  public void setEndpoint(Endpoint endpoint) {
      this.endpoint = endpoint;
  }

  @Override
  public String toString() {
      return "ResumeScheduleRequest [endpoint=" + endpoint + "]";
  }

}
