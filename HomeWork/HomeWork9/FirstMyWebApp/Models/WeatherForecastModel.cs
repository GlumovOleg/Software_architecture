namespace FirstMyWebApp.Models
{
    public class WeatherForecastModel
    {
        /// <summary>
        /// Коллекция для хранения показаний температуры
        /// </summary>
        private List<WeatherForecast> _forecasts;


        public WeatherForecastModel()
        {
            _forecasts= new List<WeatherForecast>();
        }

        public void Add(DateTime date, int temperatureC)
        {
            WeatherForecast weatherForecast = new WeatherForecast(date, temperatureC);
            _forecasts.Add(weatherForecast);
        }

        public void Update(DateTime date, int temperatureC)
        {
            foreach(WeatherForecast weatherForecast in _forecasts)
            {
                weatherForecast.TemperatureC = temperatureC;
                break;
            }
        }

        public bool Delete(DateTime date)
        {
            var forecastsByDate = from forecast in _forecasts
                                  where forecast.Date == date
                                  select forecast;
            WeatherForecast weatherForecast = forecastsByDate.FirstOrDefault();
            if (weatherForecast != null)
            {
                return _forecasts.Remove(weatherForecast);
            }
            return false;
        }

        public List<WeatherForecast> GetAll(DateTime dateFrom, DateTime dateTo){

            List<WeatherForecast> listByDate = new List<WeatherForecast>();

            foreach (WeatherForecast weatherForecast in _forecasts)
            {
                if (weatherForecast.Date >= dateFrom && weatherForecast.Date <= dateTo)
                {
                    listByDate.Add(weatherForecast);
                }
            }
            return listByDate;
        }

    }
}
