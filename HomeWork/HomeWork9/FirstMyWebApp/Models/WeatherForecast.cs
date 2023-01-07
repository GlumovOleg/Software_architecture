namespace FirstMyWebApp.Models
{
    /// <summary>
    /// Фиксация прогноза погоды
    /// </summary>
    public class WeatherForecast
    {

        /*private DateTime _date;

        public DateTime GetDateTime() 
        {
            return _date; 
        }

        public void SetDate(DateTime date)
        {
            _date = date;
        }*/

        /// <summary>
        /// Дата измерения
        /// </summary>
        public DateTime Date { get; set; }

        /// <summary>
        /// Температура воздуха в градус Цельсия
        /// </summary>
        public int TemperatureC { get; set; }

        /// <summary>
        /// Температура воздуха в градус Форенгейта
        /// </summary>
        public int TemperatureF 
        {
            get { return 32 + (int)(TemperatureC / 0.5556); }
            set { }
        }

        public WeatherForecast(DateTime date, int teTemperatureC)
        {
            Date = date;
            TemperatureC = teTemperatureC;
        }

    }

}
