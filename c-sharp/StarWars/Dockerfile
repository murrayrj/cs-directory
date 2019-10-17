# Get Base SDK Image from Microsoft
FROM mcr.microsoft.com/dotnet/core/sdk:3.0 AS build-env
WORKDIR /app

# Copy all csproj files and restore as distinct layers
COPY StarWars.Api/StarWars.Api.csproj StarWars.Api/
COPY StarWars.Core/StarWars.Core.csproj StarWars.Core/
COPY StarWars.Data/StarWars.Data.csproj StarWars.Data/
RUN dotnet restore StarWars.Api/StarWars.Api.csproj

# Copy everything else and build
COPY . ./
RUN dotnet publish -c Release -o out

# Build runtime image
FROM mcr.microsoft.com/dotnet/core/aspnet:3.0
WORKDIR /app
COPY --from=build-env /app/out .
ENTRYPOINT ["dotnet", "StarWars.Api.dll"]